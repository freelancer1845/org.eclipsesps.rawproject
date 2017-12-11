package org.eclipsesps.ui.utils;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.util.EContentAdapter;
import org.eclipsesps.spsmodel.DigitalInput;
import org.eclipsesps.spsmodel.DigitalOutput;
import org.eclipsesps.spsmodel.SpsmodelPackage;

public abstract class AbstractDigitalBindingEContentAdapter extends EContentAdapter {

  public AbstractDigitalBindingEContentAdapter() {
    super();
    if (getTarget() instanceof DigitalInput || getTarget() instanceof DigitalOutput) {
      // do nothing all is ok.
    } else {
      throw new IllegalStateException(
          "Tried to bind DigitalBindingEContentAdapter to sth. else than a Digital IO...");
    }
  }


  @Override
  public void notifyChanged(Notification notification) {
    if (notification.getEventType() == Notification.SET) {
      if (notification.getFeature() == SpsmodelPackage.Literals.ABSTRACT_IO_FIELD__VALUE) {
        stateChanged(notification.getNewBooleanValue());
      }
    }

    super.notifyChanged(notification);
  }

  protected abstract void stateChanged(boolean newBooleanValue);

}
