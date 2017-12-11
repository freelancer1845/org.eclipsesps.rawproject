package org.eclipsesps.ui.labels;

import java.util.function.Function;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipsesps.spsmodel.IIOField;
import org.eclipsesps.ui.utils.LabelBindingEContentAdapterImpl;

public abstract class AbstractIOFieldLabel<T> {

  private Label label;

  public AbstractIOFieldLabel(Composite parent, int style, IIOField<T> ioField,
      Function<Object, Boolean> validator) {

    label = new Label(parent, style);
    EObject eObject = (EObject) ioField;
    eObject.eAdapters().add(new LabelBindingEContentAdapterImpl(label, null));
  }

  public Label getLabel() {
    return label;
  }

  public void setLayoutData(Object layoutData) {
    label.setLayoutData(layoutData);
  }

}
