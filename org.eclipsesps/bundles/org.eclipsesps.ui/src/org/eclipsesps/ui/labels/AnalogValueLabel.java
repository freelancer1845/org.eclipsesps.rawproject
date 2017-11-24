package org.eclipsesps.ui.labels;

import java.util.function.Function;
import org.eclipse.swt.widgets.Composite;
import org.eclipsesps.spsmodel.IIOField;

public class AnalogValueLabel extends AbstractIOFieldLabel<Double> {

  public AnalogValueLabel(Composite parent, int style, IIOField<Double> ioField,
      Function<Object, Boolean> validator) {
    super(parent, style, ioField, validator);
  }


}
