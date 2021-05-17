/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxmleingabefelder;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

/**
 *
 * @author trainer
 */
public class SampleController implements Initializable {
    
    @FXML
    private Label lbl;
    @FXML
    private TextArea ta;
    @FXML
    private PasswordField pwf;
    
    @FXML
    private TextField tf;
   
    
    @FXML
    private void handleButtonAction1(ActionEvent event) {
        lbl.setText(tf.getText());
    }
    
    @FXML
    private void handleButtonAction2(ActionEvent event) {
        lbl.setText(ta.getText());
    }
        
    @FXML
    private void handleButtonAction3(ActionEvent event) {
        lbl.setText(pwf.getText());
    }
        
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
}
