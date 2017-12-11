package org.eclipsesps.ui.utils;

import java.util.function.Function;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.util.EContentAdapter;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipsesps.spsmodel.SpsmodelPackage;

public class LabelBindingEContentAdapterImpl extends EContentAdapter {

  private final Function<Object, Boolean> validator;

  private final Label label;

  public LabelBindingEContentAdapterImpl(Label label, Function<Object, Boolean> validator) {
    this.label = label;
    this.validator = validator;
  }

  public void notifyChanged(Notification notification) {
    if (notification.getEventType() == Notification.SET) {
      if (notification.getFeature() == SpsmodelPackage.Literals.ABSTRACT_IO_FIELD__VALUE) {
        if (validator != null) {
          if (validator.apply(notification.getNewValue())) {
            Display.getDefault()
                .asyncExec(() -> label.setText(String.valueOf(notification.getNewValue())));
          }
        } else {
          Display.getDefault()
              .asyncExec(() -> label.setText(String.valueOf(notification.getNewValue())));
        }
      }
    }
    super.notifyChanged(notification);
  }

}
