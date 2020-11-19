/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer4.pkg3.pkg6;

import javafx.animation.PathTransition;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.util.Duration;

/**
 *
 * @author Usuario
 */
public class Ejer436 extends Application {
    
    @Override
    public void start(Stage primaryStage) {

        Circle circle = new Circle(150, 125, 70);
        circle.setStroke(Color.BLACK);
        circle.setFill(Color.WHITE);

        Rectangle rectangle = new Rectangle(0, 0, 25, 50);
        rectangle.setFill(Color.ORANGE);
        
        Pane root = new Pane();
        root.getChildren().addAll(circle,rectangle);
        
        PathTransition path = new PathTransition();
        path.setDuration(Duration.millis(4000));
        path.setPath(circle);
        path.setNode(rectangle);
        path.setOrientation(PathTransition.OrientationType.ORTHOGONAL_TO_TANGENT);
        path.setCycleCount(Timeline.INDEFINITE);
        path.play();
        
        circle.setOnMousePressed(e->path.pause());
        circle.setOnMouseReleased(e->path.play());

        
        Scene scene = new Scene(root, 300, 250);
        
        primaryStage.setTitle("PathTransition");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
