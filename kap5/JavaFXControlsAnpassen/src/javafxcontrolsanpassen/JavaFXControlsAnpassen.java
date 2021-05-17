package javafxcontrolsanpassen;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class JavaFXControlsAnpassen extends Application {

     private TextField txtFld;
    private Label lb2;

    @Override
    public void start(Stage primaryStage) {
        Button btn = new Button();
        btn.setText("Übernehme Texteingabe");
        btn.layoutXProperty().set(400);
        btn.layoutYProperty().set(10);
        btn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                lb2.setText(txtFld.getText());
            }
        });
      Label lb1 = new Label();
        lb1.layoutXProperty().set(10);
        lb1.layoutYProperty().set(80);
        lb1.setText("Ein Eingabefeld");
        lb2 = new Label();
        lb2.layoutXProperty().set(10);
        lb2.layoutYProperty().set(310);
       

        lb2.setFont(new Font("Arial", 18.0));
        lb2.setWrapText(true);
        lb2.setId("lb2");
        lb2.setPrefWidth(580);
          txtFld = new TextField();

        txtFld.setPrefSize(580, 100);
        txtFld.alignmentProperty().setValue(Pos.CENTER);
        txtFld.layoutXProperty().set(10);
        txtFld.layoutYProperty().set(100);
        txtFld.setStyle("-fx-border-color: blue; -fx-border-style: solid; -fx-border-width: 2;");

        AnchorPane root = new AnchorPane();
        root.getChildren().addAll(btn, txtFld, lb1, lb2);
        Scene scene = new Scene(root, 600, 450);
        scene.getStylesheets().add(JavaFXControlsAnpassen.class.getResource("meincss.css").toExternalForm());
        primaryStage.setTitle("Controls anpassen");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public static void main(String[] args) {
        launch();
    }

}