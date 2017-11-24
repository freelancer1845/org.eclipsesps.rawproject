package org.eclipsesps.spsmodel.tests;

import java.util.HashMap;
import java.util.Map;
import org.eclipsesps.spsmodel.AbstractWriteableIOField;
import org.eclipsesps.spsmodel.IIOField;
import org.eclipsesps.spsmodel.IORegistryService;
import org.eclipsesps.spsmodel.SpsConnector;
import org.eclipsesps.spsmodel.SpsConnectorException;

public class SPSConnectorMock implements SpsConnector {

  private IORegistryService registry;

  private Map<String, Object> stateMap = new HashMap<String, Object>() {
    public Object put(String arg0, Object arg1) {
      IIOField<?> field = registry.getRegistry().get(arg0);

      if (field instanceof AbstractWriteableIOField<?>) {
        ((AbstractWriteableIOField) field).setValue(arg1);
      }
      return super.put(arg0, arg1);
    };

  };

  public SPSConnectorMock(IORegistryService ioRegistry) {
    this.registry = ioRegistry;
  }

  @Override
  public void connect(Map<String, Object> parameters) throws SpsConnectorException {

  }

  @Override
  public void disconnect() throws SpsConnectorException {}

  @Override
  public boolean isConnected() throws SpsConnectorException {
    return true;
  }

  @Override
  public void queueIOWrite(String id, Object value) throws SpsConnectorException {
    if (registry.getRegistry().containsKey(id) == false) {
      throw new IllegalStateException("ID not registered..." + id);
    }
    stateMap.put(id, value);
  }

  @Override
  public void writeIO(String id, Object value) throws SpsConnectorException {
    if (registry.getRegistry().containsKey(id) == false) {
      throw new IllegalStateException("ID not registered..." + id);
    }
    stateMap.put(id, value);
  }

  @Override
  public Object readIO(String id) throws SpsConnectorException {
    return stateMap.get(id);
  }

  @Override
  public IORegistryService getIORegistryService() {
    return registry;
  }


}
