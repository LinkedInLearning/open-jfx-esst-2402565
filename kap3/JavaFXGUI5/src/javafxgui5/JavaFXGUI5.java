/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxgui5;


import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class JavaFXGUI5 extends Application {
    Label lbl = null;
    

    @Override
    public void start(Stage primaryStage) {
        Button btn = new Button();
        btn.setText("OK");
        lbl = new Label();
        
       
        btn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                lbl.setText("Hallo Welt");
            }
        });
        
        AnchorPane root = new AnchorPane();
        btn.layoutYProperty().setValue(50);
        btn.layoutXProperty().setValue(50);
        lbl.layoutYProperty().setValue(100);
        lbl.layoutXProperty().setValue(50);
        root.getChildren().addAll(btn,lbl);
        HBox hb = new HBox();
        Button btn2 = new Button();
        btn2.setText("Klick");
        Button btn3 = new Button();
        btn3.setText("Klick");   
        hb.getChildren().addAll(btn2,btn3);
        root.getChildren().add(hb);
        Scene scene = new Scene(root, 300, 250);
        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public static void main(String[] args) {
        launch();
    }
}