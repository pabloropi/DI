/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer4.pkg3.pkg4;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author Pablo Rodriguez Pino 2ºDAM
 */
public class Ejer434 extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        
        Text text = new Text(150,100,"Progamming is fun");
        text.setOnMouseDragged(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                text.setX(event.getX());
                text.setY(event.getY());
            }
        });

        
        Pane root = new Pane();
        root.getChildren().add(text);
        
        Scene scene = new Scene(root, 400, 200);
        
        primaryStage.setTitle("Programming is fun!");
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
