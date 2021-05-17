/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxfxmllogikpublic;

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
    
    //@FXML
    public Label lbl;
    
    //@FXML
    public void handleButtonAction(ActionEvent event) {
        System.out.println("Klick " + Math.random() );
        lbl.setText("Klick " + Math.random() );
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
}
