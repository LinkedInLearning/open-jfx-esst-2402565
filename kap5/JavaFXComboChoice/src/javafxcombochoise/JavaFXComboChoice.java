/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxcombochoise;

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 *
 * @author trainer
 */
public class JavaFXComboChoice extends Application {

    @Override
    public void start(Stage primaryStage) {
        Label lbl = new Label();
        lbl.layoutXProperty().set(10);
        lbl.layoutYProperty().set(100);
        var cb = new ChoiceBox<String>();


        cb.setItems(FXCollections.observableArrayList(
                "Eins", "Zwei", "Drei", "Vier"));
        cb.setValue("Zwei");
        cb.getSelectionModel().selectedIndexProperty().addListener(new ChangeListener() {
            @Override
            public void changed(ObservableValue ov, Object t, Object t1) {
                lbl.setText("Auswahl "+ov.getValue() + " in ChoiceBox");
            }
        });
        cb.layoutXProperty().set(10);
        cb.layoutYProperty().set(10);
        ObservableList<String> options =
                FXCollections.observableArrayList(
                "Eins",
                "Zwei",
                "Drei");
        ComboBox <String>comboBox = new ComboBox<String>(options);
        comboBox.layoutXProperty().set(200);
        comboBox.layoutYProperty().set(10);
        comboBox.getSelectionModel().selectedIndexProperty().addListener(new ChangeListener() {
            @Override
            public void changed(ObservableValue ov, Object t, Object t1) {
                lbl.setText("Auswahl "+ov.getValue() + " in ComboBox");
            }
        });
        AnchorPane root = new AnchorPane();
        root.getChildren().addAll(lbl,cb, comboBox);

        Scene scene = new Scene(root, 400, 250);

        primaryStage.setTitle("ChoiceBox und ComboBox");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * The main() method is ignored in correctly deployed JavaFX application.
     * main() serves only as fallback in case the application can not be
     * launched through deployment artifacts, e.g., in IDEs with limited FX
     * support. NetBeans ignores main().
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
}
