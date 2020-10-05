/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlcircle;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

/**
 *
 * @author Pablo Rodriguez Pino 2ºDAM
 */
public class ControlCircle extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        Circle circulo = new Circle();
        circulo.setRadius(50);
        circulo.setStroke(Color.BLACK);
        circulo.setFill(Color.WHITE);
        Button breducir = new Button("Reducir");
        Button bagrandar = new Button("Agrandar");
        
        breducir.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                circulo.setRadius(circulo.getRadius() - 5);
            }
        });
        
        bagrandar.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                circulo.setRadius(circulo.getRadius() + 5);
            }
        });
        
        HBox botones = new HBox();
        botones.getChildren().add(breducir);
        botones.getChildren().add(bagrandar);
        botones.setAlignment(Pos.CENTER);
        
        
        BorderPane root = new BorderPane();
        root.setCenter(circulo);
        root.setBottom(botones);
        
        
        Scene scene = new Scene(root, 300, 250);
        
        primaryStage.setTitle("ControlCircle");
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
