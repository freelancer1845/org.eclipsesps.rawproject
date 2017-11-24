package org.eclipsesps.ui.labels;

import java.util.function.Function;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipsesps.spsmodel.IIOField;
import org.eclipsesps.ui.utils.EContentAdapterImpl;

public class DigitalStateLabel {

  private Label label;

  public DigitalStateLabel(Composite parent, int style, IIOField<Boolean> digitalField,
      Function<Object, Boolean> validator) {
    label = new Label(parent, style);
    EObject eObject = (EObject) digitalField;
    eObject.eAdapters().add(new EContentAdapterImpl(label, null));
  }

  public Label getLabel() {
    return label;
  }

  public void setLayoutData(Object layoutData) {
    label.setLayoutData(layoutData);
  }



}
