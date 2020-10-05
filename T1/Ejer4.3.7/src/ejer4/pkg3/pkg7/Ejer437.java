/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer4.pkg3.pkg7;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.shape.Ellipse;
import javafx.stage.Stage;

/**
 *
 * @author Usuario
 */
public class Ejer437 extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        
        Ellipse ellipse = new Ellipse(10, 10, 100, 50);
        
        StackPane root = new StackPane();
        root.getChildren().add(ellipse);
        
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
