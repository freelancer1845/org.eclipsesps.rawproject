package org.eclipsesps.spsmodel;

import java.util.Map;

public interface SpsConnector {

  public void connect(Map<String, Object> parameters) throws SpsConnectorException;

  public void disconnect() throws SpsConnectorException;

  public boolean isConnected() throws SpsConnectorException;

  public void queueIOWrite(String id, Object value) throws SpsConnectorException;

  public void writeIO(String id, Object value) throws SpsConnectorException;

  public Object readIO(String id) throws SpsConnectorException;

  public IORegistryService getIORegistryService();

}
