/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxtext;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

import javafx.stage.Stage;

/**
 *
 * @author trainer
 */
public class JavaFXText extends Application {

    @Override
    public void start(Stage primaryStage) {
        Text t1 = new Text();
        t1.setText("RJS EDV-KnowHow");
        t1.setFont(Font.font("Arial",24));
        t1.setFill(Color.RED);


        Text t2 = new Text("Dipl Math Ralph Steyer");
        t2.setId("t");


        BorderPane root = new BorderPane();
        VBox vb = new VBox();
        vb.getChildren().addAll(t1, t2);
        root.getChildren().add(vb);

        Scene scene = new Scene(root, 550, 150);
        scene.getStylesheets().add(JavaFXText.class.getResource("text.css").toExternalForm());

        primaryStage.setTitle("Text");
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
