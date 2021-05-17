/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxgruppe;

import javafx.scene.shape.Rectangle;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

/**
 *
 * @author trainer
 */
public class JavaFXGruppe extends Application {

    @Override
    public void start(Stage primaryStage) {
        Button btn = new Button();
        btn.setText("Klick");
        Label lb = new Label();
        lb.setText("Ein Label");
        TextField tf = new TextField();
        Group groot = new Group();
        lb.layoutXProperty().set(50);
        lb.layoutYProperty().set(50);
        btn.layoutXProperty().set(50);
        btn.layoutYProperty().set(100);
        tf.layoutXProperty().set(50);
        tf.layoutYProperty().set(400);
        
        Rectangle r = new Rectangle(125, 125, 250, 250);
        r.setFill(Color.BLUE);


        groot.getChildren().addAll(btn, lb, r, tf);
        Button btn2 = new Button("Klack");
        BorderPane root = new BorderPane();

        root.getChildren().add(groot);
        root.setBottom(btn2);


        Scene scene = new Scene(root, 550, 550, Color.YELLOW);

        primaryStage.setTitle("Gruppieren und der Scene Gaph");
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
