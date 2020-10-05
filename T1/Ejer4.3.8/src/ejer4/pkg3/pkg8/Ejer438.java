/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer4.pkg3.pkg8;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

/**
 *
 * @author Usuario
 */
public class Ejer438 extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        
        Label label = new Label();
        
        Circle circle = new Circle(150, 125, 10);
        circle.setStroke(Color.BLACK);

        Pane root = new Pane();
        root.getChildren().addAll(label, circle);
        
        
        Scene scene = new Scene(root, 300, 250);
        
        primaryStage.setTitle("Hello World!");
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
