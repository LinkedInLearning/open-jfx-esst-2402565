/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxfxmllogik;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

/**
 *
 * @author trainer
 */
public class SampleController implements Initializable {
    
    @FXML
    private Label lbl;
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        System.out.println("Klick " + Math.random() );
        lbl.setText("Klick " + Math.random() );
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
}