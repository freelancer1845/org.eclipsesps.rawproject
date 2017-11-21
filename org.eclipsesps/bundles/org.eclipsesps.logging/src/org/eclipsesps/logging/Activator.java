package org.eclipsesps.logging;

import java.io.File;
import org.eclipsesps.util.FileUtils;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.slf4j.ILoggerFactory;
import org.slf4j.LoggerFactory;
import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.classic.joran.JoranConfigurator;

public class Activator implements BundleActivator {

  private static BundleContext context;

  static BundleContext getContext() {
    return context;
  }

  /*
   * (non-Javadoc)
   * 
   * @see org.osgi.framework.BundleActivator#start(org.osgi.framework.BundleContext)
   */
  public void start(BundleContext bundleContext) throws Exception {
    Activator.context = bundleContext;

    ILoggerFactory iLoggerFactory = LoggerFactory.getILoggerFactory();
    LoggerContext loggerContext = (LoggerContext) iLoggerFactory;
    JoranConfigurator configurator = new JoranConfigurator();
    configurator.setContext(loggerContext);

    loggerContext.reset();
    File logbackFile = null;
    logbackFile = FileUtils.locateRootFile("logback.xml");

    if (logbackFile != null && logbackFile.isFile()) {
      configurator.doConfigure(logbackFile);
    } else {
      throw new IllegalStateException("Logback file not found...");
    }
  }

  /*
   * (non-Javadoc)
   * 
   * @see org.osgi.framework.BundleActivator#stop(org.osgi.framework.BundleContext)
   */
  public void stop(BundleContext bundleContext) throws Exception {
    Activator.context = null;
  }

}
