package org.eclipsesps.spsmodel.tests;

import static org.junit.Assert.assertTrue;
import org.eclipsesps.spsmodel.AnalogInput;
import org.eclipsesps.spsmodel.SpsmodelFactory;
import org.junit.Before;
import org.junit.Test;

public class RegistryTest {
  private SpsmodelFactory factory;

  private OSGIRegistryServiceMock registry;

  @Before
  public void before() {
    factory = SpsmodelFactory.eINSTANCE;
    registry = new OSGIRegistryServiceMock();
  }

  @Test
  public void checkRegistering() {
    factory.createAnalogInput();
    assertTrue("Registry was empty...", registry.getIORegistry().getRegistry().isEmpty() == false);
  }

  @Test
  public void checkIdChange() {
    AnalogInput testInput = factory.createAnalogInput();
    testInput.setId("testId");
    assertTrue("Registry should have exactly one IOField...",
        registry.getIORegistry().getRegistry().keySet().size() == 1);
    assertTrue("IOFields id schould be \"testId\"", registry.getIORegistry().getRegistry()
        .entrySet().iterator().next().getKey().equals("testId"));
  }

  @Test
  public void testDeregistering() {
    AnalogInput testInput = factory.createAnalogInput();
    testInput.setId("testId");
    registry.getIORegistry().deregisterIOField(testInput.getId());
    assertTrue("Registry didnt remove field...",
        registry.getIORegistry().getRegistry().containsKey(testInput.getId()) == false);
  }



}
