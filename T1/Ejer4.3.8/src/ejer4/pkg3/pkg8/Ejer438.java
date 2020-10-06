/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer4.pkg3.pkg8;

import com.sun.javafx.perf.PerformanceTracker;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javafx.util.Duration;

/**
 *
 * @author Usuario
 */

public class Ejer438 extends Application {
    
    public static double ballspeedx = 1;
    public static double ballspeedy = 1;
    
    @Override
    public void start(Stage primaryStage) {
        
        // Etiqueta con los FPS
        Label label = new Label();
        
        // Bola
        Circle ball = new Circle(10);
        ball.setTranslateX(450 *0.5);
        ball.setTranslateY(350 *0.5);
        ball.setStroke(Color.BLACK);

        // Pane y escena
        Pane root = new Pane();
        root.getChildren().addAll(label, ball);
       
        Scene scene = new Scene(root, 450, 350);
        
        // Escuchador a incluir en el bucle de Timeline
        EventHandler<ActionEvent> eH = e->{
            
            // Mostrar la frecuencia de refresco FPS
            PerformanceTracker perfTracker = PerformanceTracker.getSceneTracker(scene);
            
            label.setText("FPS (Timeline) = "+perfTracker.getInstantFPS());
            
            // Cambiar la dirección de la bola si llega a los extremos
            if(ball.getTranslateX() < 10 ||ball.getTranslateX() > 440)
            {
                ballspeedx *=-1;
            }
            
            ball.setTranslateX(ball.getTranslateX()+ ballspeedx);
            
            if(ball.getTranslateY() < 10 ||ball.getTranslateY() > 340)
            {
                ballspeedy *=-1;
            }
            
            ball.setTranslateY(ball.getTranslateY()+ ballspeedy);
        };
        
        
        /* Definimos el bucle con la duración, cada 5 milisegundos que son
        aproximadamente 60 FPS */
        Timeline animation = new Timeline(new KeyFrame(Duration.millis(5),eH));
        animation.setCycleCount(Timeline.INDEFINITE);
        
        // iniciamos animation
        animation.play();

        
        primaryStage.setTitle("Bouncing Ball");
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
