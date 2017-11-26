package org.eclipsesps.spsmodel.tests;

import org.eclipsesps.spsmodel.SpsConnectorException;
import org.eclipsesps.spsmodel.SpsmodelFactory;
import org.junit.Before;
import org.junit.Test;

public class IOFieldTest {

  private OSGIRegistryServiceMock registry;

  private SpsmodelFactory factory;

  @Before
  public void before() {
    factory = SpsmodelFactory.eINSTANCE;
    registry = new OSGIRegistryServiceMock();
  }

  @Test
  public void testWriting() throws SpsConnectorException {

    /*
     * AnalogOutput output = factory.createAnalogOutput(); output.setId("testId");
     * output.writeValue(1);
     * assertTrue("AbstractWritableIOField field did not transmit write to sps connector.", (Double)
     * registry.getSpsConnector().readIO(output.getId()) == 1);
     * assertTrue("SpsConnector did not change the field of the output...", output.getValue() == 1);
     */
  }



}
