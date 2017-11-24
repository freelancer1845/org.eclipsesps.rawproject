package org.eclipsesps.spsmodel.util;

import org.eclipsesps.spsmodel.IORegistryService;
import org.eclipsesps.spsmodel.SpsConnector;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

@Component(immediate = true)
public class OSGIRegistryAccess {

  @Reference
  private SpsConnector spsConnector;

  @Reference
  private IORegistryService ioRegistry;

  private static OSGIRegistryAccess instance = null;

  public OSGIRegistryAccess() {
    instance = this;
  }

  public static OSGIRegistryAccess getInstance() {
    return instance;
  }

  public SpsConnector getSpsConnector() {
    if (spsConnector == null) {
      throw new IllegalStateException("Model could not find SpsConnector...");
    }
    return spsConnector;
  }

  public IORegistryService getIORegistry() {
    if (ioRegistry == null) {
      throw new IllegalStateException("IORegistyService could not be found by mode...");
    }
    return ioRegistry;
  }



}
