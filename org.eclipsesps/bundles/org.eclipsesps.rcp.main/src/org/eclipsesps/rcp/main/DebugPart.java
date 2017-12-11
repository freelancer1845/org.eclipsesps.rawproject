
package org.eclipsesps.rcp.main;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.PostConstruct;
import org.eclipse.jface.dialogs.IInputValidator;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipsesps.spsmodel.AnalogOutput;
import org.eclipsesps.spsmodel.SpsConnector;
import org.eclipsesps.spsmodel.SpsConnectorException;
import org.eclipsesps.spsmodel.SpsmodelFactory;
import org.eclipsesps.ui.edit.AnalogEditField;

public class DebugPart {

  private Composite composite;

  @PostConstruct
  public void postConstruct(Composite parent, SpsConnector spsConnector)
      throws SpsConnectorException {

    Map<String, Object> parameters = new HashMap<>();
    parameters.put(SpsConnector.PARAMETER_IP_ADDRESS, "localhost");
    parameters.put(SpsConnector.PARAMETER_PORT, 502);

    spsConnector.connect(parameters);


    composite = new Composite(parent, SWT.NONE);
    composite.setLayout(new GridLayout(1, true));

    AnalogOutput output = SpsmodelFactory.eINSTANCE.createAnalogOutput();
    output.setId("000001");

    AnalogEditField editField =
        new AnalogEditField(parent, SWT.NONE, "Test Output", new IInputValidator() {

          @Override
          public String isValid(String newText) {
            try {
              Integer.valueOf(newText);
            } catch (NumberFormatException e) {
              return "Number not formatted in integer format";
            }
            return null;
          }
        }, output);

  }

}
