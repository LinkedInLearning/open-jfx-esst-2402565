/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxbremsweg;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;

/**
 *
 * @author ralph
 */
public class SampleController implements Initializable {

    private Bremsweg obj = new Bremsweg();
    @FXML
    private Label label1;
    @FXML
    private CheckBox chkBox1;
    @FXML
    private TextField textField1;
    @FXML
    private ChoiceBox choiceBox1;
    @FXML
    private TextArea textArea1;

    @FXML
    private void handleButtonAction(ActionEvent event) {
         textArea1.setVisible(false);

        double faktor = 1;
        double bwm = 0;
        switch (choiceBox1.getValue().toString()) {
            case "Trockene Fahrbahn - Gefahrenbremsung":
                faktor = 0.5;
                break;
            case "Nasse Fahrbahn":
                faktor = 1.5;
                break;
            case "Eis":
                faktor = 6.5;
                break;
            default:
                faktor = 1;
                break;
        }
        try {
            bwm = obj.getBremsweg(
                            Double.valueOf(textField1.getText()), faktor, chkBox1.selectedProperty().getValue()
            );
            label1.setText(bwm
                    + " Meter");

        } catch (NumberFormatException e) {
            textArea1.setVisible(true);
            textArea1.setText("Falsche Eingabe. Sie dürfen nur ganze Zahlen als Geschwindigkeit eingeben. Ebenso darf das Eingabefeld für die Geschwindigkeit nicht leer sein.");
            label1.setText("0");

        }

    }

    @FXML
    private void handleButton2Action(ActionEvent event) {
        System.exit(1);
    }
  @FXML
    private void handleTextFieldAction(ActionEvent event) {
        textArea1.setText("");
        label1.setText("");
        textArea1.setVisible(false);
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        choiceBox1.getSelectionModel().select(0);
        textField1.setText("0");


    }
}
