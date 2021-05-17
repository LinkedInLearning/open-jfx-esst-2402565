/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxgrafischeprimitive;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.effect.DropShadow;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;

import javafx.stage.Stage;

/**
 *
 * @author trainer
 */
public class JavaFXGrafischePrimitive extends Application {

    @Override
    @SuppressWarnings("empty-statement")
    public void start(Stage primaryStage) {
        Rectangle t1 = new Rectangle(20, 20, 200, 100);
        t1.setFill(Color.RED);

        Circle t2 = new Circle(300, 150, 75);
        t2.setId("t");
        Arc arc = new Arc();
        arc.setCenterX(150.0f);
        arc.setCenterY(150.0f);
        arc.setRadiusX(25.0f);
        arc.setRadiusY(25.0f);
        arc.setStartAngle(45.0f);
        arc.setLength(270.0f);
        arc.setType(ArcType.ROUND);
        arc.setFill(Color.AQUA);
        DropShadow ds = new DropShadow();
        ds.setOffsetY(5.0f);
        ds.setOffsetX(2.0f);
        ds.setColor(Color.BLACK);
        arc.setEffect(ds);
        BorderPane root = new BorderPane();
        
        Group vb = new Group();
        vb.getChildren().addAll(t1,arc,t2);
        root.getChildren().add(vb);

        Scene scene = new Scene(root, 400, 250);
        scene.getStylesheets().add(JavaFXGrafischePrimitive.class.getResource("text.css").toExternalForm());

        primaryStage.setTitle("Grafische Formen");
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
