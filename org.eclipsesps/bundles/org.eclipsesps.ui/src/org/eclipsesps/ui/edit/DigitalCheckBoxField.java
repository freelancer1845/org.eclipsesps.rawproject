package org.eclipsesps.ui.edit;

import java.awt.Button;
import java.awt.GridLayout;
import java.awt.Label;
import org.eclipse.swt.widgets.Composite;
import org.eclipsesps.spsmodel.AbstractIOField;
import org.eclipsesps.spsmodel.AbstractWriteableIOField;
import org.eclipsesps.ui.utils.AbstractDigitalBindingEContentAdapter;
import org.slf4j.LoggerFactory;

public class DigitalCheckBoxField extends Composite {

  /** The usual Logger. */
  private static final Logger LOGGER = LoggerFactory.getLogger(AnalogEditField.class);

  private final String labelText;

  private final AbstractIOField<Boolean> digitalField;

  private final Label label;

  private final Button cbButton;

  private final boolean readOnly;

  public DigitalCheckBoxField(Composite parent, int style, String labelText,
      AbstractIOField<Boolean> digitalField) {
    boolean pReadOnly = false;
    if ((digitalField instanceof AbstractWriteableIOField<?>) == false) {
      pReadOnly = true;
    }
    DigitalEditField(parent, style, labelText, digitalField, pReadOnly);
  }

  public DigitalCheckBoxField(Composite parent, int style, String labelText,
      AbstractIOField<Boolean> digitalField, boolean readOnly) {
    super(parent, style);

    this.labelText = labelText;
    this.digitalField = digitalField;
    this.readOnly = readOnly;

    createLayout();
    createControls();
    addListeners();
  }

  private void createLayout() {
    GridLayout layout = new GridLayout();
    layout.numColumns = 2;
    layout.makeColumnsEqualWidth = false;
    this.setLayout(layout);
  }


  private void createControls() {
    label = new Label(this, SWT.NONE);
    label.setText(labeltext);
    label.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, true, false));
    cbButton = new Button(this, SWT.PUSH);
    cbButton.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false));
    cbButton.setSelection(digitalField.getValue());
    if (readOnly == true) {
      cbButton.setEnabled(false);
    }
  }

  private void addListeners() {
    cbButton.addSelectionListener(new SelectionAdapter() {

      @Override
      public void widgetSelected(SelectionEvent e) {
        digitalField.setValue(cbButton.getSelection());
      }

    });

    digitalOutput.eAdapters().add(new AbstractDigitalBindingEContentAdapter() {

      @Override
      protected void stateChanged(boolean newBooleanValue) {
        Display.getDefault().asyncExec(() -> cbButton.setSelection(newBooelanvalue));
      }
    });
  }

}
