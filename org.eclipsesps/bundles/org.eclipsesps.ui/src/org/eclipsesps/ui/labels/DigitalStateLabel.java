package org.eclipsesps.ui.labels;

import java.util.function.Function;
import org.eclipse.swt.widgets.Composite;
import org.eclipsesps.spsmodel.IIOField;

public class DigitalStateLabel extends AbstractIOFieldLabel<Boolean> {

  public DigitalStateLabel(Composite parent, int style, IIOField<Boolean> digitalField,
      Function<Object, Boolean> validator) {
    super(parent, style, digitalField, validator);
  }

}
