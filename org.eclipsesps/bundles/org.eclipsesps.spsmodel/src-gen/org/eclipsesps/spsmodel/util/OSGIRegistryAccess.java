package org.eclipsesps.spsmodel.util;

import org.eclipsesps.spsmodel.IORegistryService;
import org.eclipsesps.spsmodel.SpsConnector;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.component.annotations.ReferenceCardinality;
import org.osgi.service.component.annotations.ReferencePolicy;

@Component(immediate = true)
public class OSGIRegistryAccess {

  @Reference(cardinality = ReferenceCardinality.OPTIONAL, policy = ReferencePolicy.DYNAMIC)
  private volatile SpsConnector spsConnector;

  @Reference(cardinality = ReferenceCardinality.MANDATORY)
  private IORegistryService ioRegistry;

  private static OSGIRegistryAccess instance = null;

  public OSGIRegistryAccess() {}

  @Activate
  protected void activate() {
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
      throw new IllegalStateException("IORegistyService could not be found by model...");
    }
    return ioRegistry;
  }



}
