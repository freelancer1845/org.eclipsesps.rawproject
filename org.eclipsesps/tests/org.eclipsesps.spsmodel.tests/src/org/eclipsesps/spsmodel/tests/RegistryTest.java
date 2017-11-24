package org.eclipsesps.spsmodel.tests;

import static org.junit.Assert.assertTrue;
import org.eclipsesps.spsmodel.AnalogInput;
import org.eclipsesps.spsmodel.SpsmodelFactory;
import org.eclipsesps.spsmodel.util.OSGIRegistryAccess;
import org.junit.Before;
import org.junit.Test;

public class RegistryTest {
  private SpsmodelFactory factory;

  @Before
  public void before() {
    factory = SpsmodelFactory.eINSTANCE;
  }

  @Test
  public void checkRegistering() {
    factory.createAnalogInput();
    assertTrue("Registry was empty...",
        OSGIRegistryAccess.getInstance().getIORegistry().getRegistry().isEmpty() == false);
  }

  @Test
  public void checkIdChange() {
    AnalogInput testInput = factory.createAnalogInput();
    testInput.setId("testId");
    assertTrue("Registry should have exactly one IOField...",
        OSGIRegistryAccess.getInstance().getIORegistry().getRegistry().keySet().size() == 1);
    assertTrue("IOFields id schould be \"testId\"", OSGIRegistryAccess.getInstance().getIORegistry()
        .getRegistry().entrySet().iterator().next().getKey().equals("testId"));
  }

  @Test
  public void testDeregistering() {
    AnalogInput testInput = factory.createAnalogInput();
    testInput.setId("testId");
    OSGIRegistryAccess.getInstance().getIORegistry().deregisterIOField(testInput.getId());
    assertTrue("Registry didnt remove field...", OSGIRegistryAccess.getInstance().getIORegistry()
        .getRegistry().containsKey(testInput.getId()) == false);
  }



}
