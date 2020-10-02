/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer4.pkg3.pkg5;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author Pablo Rodriguez Pino 2ºDAM
 */
public class Ejer435 extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        
        Text texto = new Text (20,20,"A");
        Pane root = new Pane();
        root.getChildren().add(texto);
        Scene scene = new Scene(root, 300, 250);
                
        scene.setOnKeyPressed(new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent evento) {
                switch (evento.getCode()) {
                    case DOWN:
                        texto.setY(texto.getY() + 10);
                        break;
                    case LEFT:
                        texto.setX(texto.getX() - 10);
                        break;
                    case UP:
                        texto.setY(texto.getY() - 10);
                        break;
                    case RIGHT:
                        texto.setX(texto.getX() + 10);
                        break;
                    default:
                        if(Character.isLetter(texto.getText().charAt(0)))
                            texto.setText(evento.getText());
                        else if(Character.isDigit(texto.getText().charAt(0)))
                            texto.setText(evento.getText());
                        break;
                }
                

    
                
            }
            });
        

   
        primaryStage.setTitle("Ejer4.3.5");
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
