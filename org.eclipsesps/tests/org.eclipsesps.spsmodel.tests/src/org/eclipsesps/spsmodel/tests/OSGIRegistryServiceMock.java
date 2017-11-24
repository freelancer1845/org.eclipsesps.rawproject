package org.eclipsesps.spsmodel.tests;

import org.eclipsesps.spsmodel.IORegistryService;
import org.eclipsesps.spsmodel.SpsConnector;
import org.eclipsesps.spsmodel.impl.IORegistryServiceImpl;
import org.eclipsesps.spsmodel.util.OSGIRegistryAccess;

public class OSGIRegistryServiceMock extends OSGIRegistryAccess {

  private IORegistryService ioRegistry = new IORegistryServiceImpl();

  private SpsConnector spsConnector = new SPSConnectorMock(ioRegistry);

  public OSGIRegistryServiceMock() {}

  @Override
  public IORegistryService getIORegistry() {
    return ioRegistry;
  }

  @Override
  public SpsConnector getSpsConnector() {
    return spsConnector;
  }

}
