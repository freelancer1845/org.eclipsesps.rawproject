package org.eclipsesps.spsmodel.util;

import org.eclipsesps.spsconnector.api.SpsConnector;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

@Component(immediate = true)
public class SpsConnectorRegistry {

  @Reference
  private SpsConnector spsConnector;

  private static SpsConnectorRegistry instance = null;

  public SpsConnectorRegistry() {
    instance = this;
  }

  public static SpsConnectorRegistry getInstance() {
    return instance;
  }

  public SpsConnector getSpsConnector() {
    if (spsConnector == null) {
      throw new IllegalStateException("Model could not find SpsConnector...");
    }
    return spsConnector;
  }



}
