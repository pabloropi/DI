
package ejer4.pkg3.pkg2;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

/**
 *
 * @author Pablo Rodriguez Pino 2ºDAM
 */
public class Ejer432 extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        
        // Creo los botones
        Button bnew = new Button("New");
        Button bopen = new Button("Open");
        Button bsave = new Button("Save");
        Button bprint = new Button("Print");
        
        // Eventos Annonymous Inner Class
        bnew.setOnAction(
        new EventHandler<ActionEvent>() {
            @Override
            public void handle (ActionEvent e) {
                System.out.println("Nuevo Proceso");
            }
        });
        
        bopen.setOnAction(
        new EventHandler<ActionEvent>() {
            @Override
            public void handle (ActionEvent e) {
                System.out.println("Abrir Proceso");
            }
        });
        
        bsave.setOnAction(
        new EventHandler<ActionEvent>() {
            @Override
            public void handle (ActionEvent e) {
                System.out.println("Guardar Proceso");
            }
        });
        
        bprint.setOnAction(
        new EventHandler<ActionEvent>() {
            @Override
            public void handle (ActionEvent e) {
                System.out.println("Imprimir Proceso");
            }
        });
        
        // Creo HBox y le pongo sus propiedades
        HBox hbox = new HBox();
        hbox.getChildren().addAll(bnew,bopen,bsave,bprint);
        hbox.setAlignment(Pos.CENTER);
        hbox.setSpacing(15);
        
        
        Scene scene = new Scene(hbox, 400, 100);
        
        primaryStage.setTitle("Ejer4.3.2");
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
