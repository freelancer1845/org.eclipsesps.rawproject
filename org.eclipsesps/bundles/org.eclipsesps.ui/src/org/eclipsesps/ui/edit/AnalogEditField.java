package org.eclipsesps.ui.edit;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.util.EContentAdapter;
import org.eclipse.jface.dialogs.IInputValidator;
import org.eclipse.jface.dialogs.InputDialog;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipsesps.spsmodel.AnalogOutput;
import org.eclipsesps.spsmodel.SpsConnectorException;
import org.eclipsesps.spsmodel.SpsmodelPackage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AnalogEditField extends Composite {

  /** The usual Logger. */
  private static final Logger LOGGER = LoggerFactory.getLogger(AnalogEditField.class);



  private AnalogOutput analogOutput;
  private IInputValidator validator;
  private String labelText;
  private Button setButton;

  private Text text;



  private Label label;

  public AnalogEditField(Composite parent, int style, String labelText, IInputValidator validator,
      AnalogOutput analogOutput) {
    super(parent, style);
    this.analogOutput = analogOutput;
    this.validator = validator;
    this.labelText = labelText;
    createLayout();
    createControls();
    addAnalogOutputChangeListener();
  }



  private void createLayout() {
    GridLayout layout = new GridLayout();
    layout.numColumns = 3;
    layout.makeColumnsEqualWidth = false;
    this.setLayout(layout);
  }

  private void createControls() {

    label = new Label(this, SWT.NONE);
    label.setText(labelText);
    label.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, false, false));
    text = new Text(this, SWT.BORDER | SWT.READ_ONLY);
    text.setText(String.valueOf(analogOutput.getValue()));
    text.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false));



    setButton = new Button(this, SWT.PUSH);
    setButton.setText("Set");
    setButton.addSelectionListener(new SelectionAdapter() {

      @Override
      public void widgetSelected(SelectionEvent e) {

        InputDialog dialog = new InputDialog(getShell(), "Set Value",
            "Set Value of control: " + labelText, analogOutput.getValue().toString(), validator);
        if (dialog.open() == Window.OK) {
          try {
            Integer value = Integer.valueOf((String) dialog.getValue());
            try {
              analogOutput.writeValue(value);
            } catch (SpsConnectorException e1) {
              LOGGER.error("Failed to write value on user action...", e1);
              MessageDialog.openError(getShell(), "Failed to write value", e1.getMessage());
            }
          } catch (NumberFormatException ex) {
            //
          }
        }

      }

    });

    setButton.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false));
  }

  private void addAnalogOutputChangeListener() {
    analogOutput.eAdapters().add(new EContentAdapter() {
      @Override
      public void notifyChanged(Notification notification) {
        if (notification.getEventType() == Notification.SET) {
          if (notification.getFeature() == SpsmodelPackage.Literals.ABSTRACT_IO_FIELD__VALUE) {
            Display.getDefault().asyncExec(() -> text.setText(notification.getNewStringValue()));
          }
        }
        super.notifyChanged(notification);
      }
    });

  }

}
