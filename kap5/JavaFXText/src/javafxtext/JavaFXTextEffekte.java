/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxtext;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.effect.DropShadow;
import javafx.scene.effect.InnerShadow;
import javafx.scene.effect.Reflection;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;

import javafx.stage.Stage;

/**
 *
 * @author trainer
 */
public class JavaFXTextEffekte extends Application {

    @Override
    public void start(Stage primaryStage) {
        Text t1 = new Text();
        t1.setText("RJS EDV-KnowHow");
        t1.setFont(Font.font("Arial", FontWeight.BOLD, 80));
        t1.setFill(Color.RED);
        InnerShadow is = new InnerShadow();
        is.setOffsetX(4.0f);
        is.setOffsetY(4.0f);
        Text t2 = new Text("Dipl Math Ralph Steyer");
        t2.setId("t");
        Reflection r = new Reflection();
        r.setFraction(0.7f);
        DropShadow ds = new DropShadow();
        ds.setOffsetY(5.0f);
        ds.setOffsetX(2.0f);
        ds.setColor(Color.BLACK);
        t2.setEffect(ds);
        t1.setEffect(is);

        BorderPane root = new BorderPane();
        VBox vb = new VBox();
        vb.getChildren().addAll(t1, t2);
        root.getChildren().add(vb);

        Scene scene = new Scene(root, 800, 250);
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
