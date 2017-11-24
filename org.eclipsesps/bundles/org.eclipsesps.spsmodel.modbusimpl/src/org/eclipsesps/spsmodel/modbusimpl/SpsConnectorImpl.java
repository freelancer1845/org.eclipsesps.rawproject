package org.eclipsesps.spsmodel.modbusimpl;

import java.io.IOException;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.LinkedBlockingQueue;
import org.eclipsesps.spsmodel.AbstractIOField;
import org.eclipsesps.spsmodel.AnalogInput;
import org.eclipsesps.spsmodel.AnalogOutput;
import org.eclipsesps.spsmodel.DigitalInput;
import org.eclipsesps.spsmodel.DigitalOutput;
import org.eclipsesps.spsmodel.IORegistryService;
import org.eclipsesps.spsmodel.SpsConnector;
import org.eclipsesps.spsmodel.SpsConnectorException;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.component.annotations.ReferenceCardinality;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import de.re.easymodbus.exceptions.ModbusException;
import de.re.easymodbus.modbusclient.ModbusClient;

@Component
public class SpsConnectorImpl implements SpsConnector {

  /** The usual Logger. */
  private static final Logger LOGGER = LoggerFactory.getLogger(SpsConnectorImpl.class);


  @Reference(cardinality = ReferenceCardinality.OPTIONAL)
  private IORegistryService ioRegistryService;

  private ModbusClient client;

  private LinkedBlockingQueue<IOQueueObject> writeQueue;


  @Deactivate
  protected void deactivate() throws SpsConnectorException {
    if (isConnected()) {
      disconnect();
    }
  }

  @Override
  public void connect(Map<String, Object> parameters) throws SpsConnectorException {
    if (client != null) {
      if (client.isConnected() == true) {
        throw new SpsConnectorException("Already connected to: " + client.getipAddress());
      }
    }
    client = new ModbusClient();
    client.setipAddress((String) parameters.get(PARAMETER_IP_ADDRESS));
    client.setPort((int) parameters.get(PARAMETER_PORT));
    try {
      client.Connect();
    } catch (UnknownHostException e) {
      throw new SpsConnectorException("Host not found...", e);
    } catch (IOException e) {
      throw new SpsConnectorException("Unkown IOException...", e);
    }


    if (parameters.containsKey(UPDATE_TICK_RATE)) {
      startUpdateLoop((int) parameters.get(UPDATE_TICK_RATE));
    } else {
      startUpdateLoop(1);
    }

  }

  private void startUpdateLoop(int tickrate) {
    writeQueue = new LinkedBlockingQueue<>();

    Thread thread = new Thread(new Runnable() {

      @Override
      public void run() {
        LOGGER.debug("Starting update Thread....");
        try {
          long lastTime = System.nanoTime();
          long difference;
          long tickTime = (long) (1e9 / tickrate);
          while (isConnected()) {
            while (writeQueue.peek() != null) {
              IOQueueObject object = writeQueue.poll();
              writeIO(object.getId(), object.getValue());
              difference = (System.nanoTime() - lastTime);
              if (difference > tickTime) {
                break;
              }
            }

            readIOs();

            difference = (System.nanoTime() - lastTime);
            if (difference < tickTime) {
              Thread.sleep((long) ((tickTime - difference) / 1e6));
            }
            lastTime = System.nanoTime();
          }
        } catch (SpsConnectorException | InterruptedException e) {
          LOGGER.error("Updater thread failed...", e);
          try {
            disconnect();
          } catch (SpsConnectorException e1) {
            LOGGER.error("Disconnect after updater thread fail, failed", e1);
          }
        }
        LOGGER.debug("Updater Thread finished orderly");
      }

      @SuppressWarnings("unchecked")
      private void readIOs() throws SpsConnectorException {
        if (ioRegistryService == null) {
          return;
        }

        for (Entry<String, AbstractIOField<?>> entry : ioRegistryService.getRegistry().entrySet()) {
          AbstractIOField<?> abstractField = entry.getValue();
          if (abstractField instanceof AnalogInput || abstractField instanceof AnalogOutput) {
            AbstractIOField<Integer> field = (AbstractIOField<Integer>) abstractField;
            field.setValue((Integer) readIO(abstractField.getId()));
          } else if (abstractField instanceof DigitalInput
              || abstractField instanceof DigitalOutput) {
            AbstractIOField<Boolean> field = (AbstractIOField<Boolean>) abstractField;
            field.setValue((Boolean) readIO(abstractField.getId()));
          } else {
            LOGGER.debug("Unsupported element " + abstractField.getClass().getName());
          }
        }


      }
    });

    thread.start();

  }

  @Override
  public void disconnect() throws SpsConnectorException {
    if (client.isConnected() == false) {
      throw new SpsConnectorException("Not connected.");
    }
    try {
      client.Disconnect();
    } catch (IOException e) {
      throw new SpsConnectorException("Unkown IOException", e);
    }
  }

  @Override
  public boolean isConnected() throws SpsConnectorException {
    if (client != null) {
      return client.isConnected();
    } else {
      return false;
    }
  }

  @Override
  public void queueIOWrite(String id, Object value) throws SpsConnectorException {
    writeQueue.add(new IOQueueObject(id, value));
  }

  @Override
  public synchronized void writeIO(String id, Object value) throws SpsConnectorException {
    try {
      client.WriteSingleRegister(Integer.valueOf(id), (int) value);
    } catch (NumberFormatException e) {
      throw new SpsConnectorException("Id of IO has not the right format (must be integer)");
    } catch (UnknownHostException e) {
      throw new SpsConnectorException("Uknown Host", e);
    } catch (SocketException e) {
      throw new SpsConnectorException("Socket failed", e);
    } catch (ModbusException e) {
      throw new SpsConnectorException("Modbus failed", e);
    } catch (IOException e) {
      throw new SpsConnectorException("Unkown IOException", e);
    }
  }

  @Override
  public synchronized Object readIO(String id) throws SpsConnectorException {
    try {
      Object value;
      value = client.ReadHoldingRegisters(Integer.valueOf(id), 1)[0];
      return value;
    } catch (NumberFormatException e) {
      throw new SpsConnectorException("Id of IO has not the right format (must be integer)");
    } catch (UnknownHostException e) {
      throw new SpsConnectorException("Uknown Host", e);
    } catch (SocketException e) {
      throw new SpsConnectorException("Socket failed", e);
    } catch (ModbusException e) {
      throw new SpsConnectorException("Modbus failed", e);
    } catch (IOException e) {
      throw new SpsConnectorException("Unkown IOException", e);
    }
  }

  @Override
  public IORegistryService getIORegistryService() {
    // TODO Auto-generated method stub
    return null;
  }

  private final class IOQueueObject {
    private final String id;

    private final Object value;

    public IOQueueObject(String id, Object value) {
      this.id = id;
      this.value = value;
    }

    public String getId() {
      return id;
    }

    public Object getValue() {
      return value;
    }

  }

}
