/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dialog2;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Dialog2 extends Application {
    public static void main(String[] args) {
        Application.launch(args);
    }
    @Override
    public void start(final Stage primaryStage) {
        
        // Crear el group y la escena
        primaryStage.setTitle("Dialog 2");
        Group root = new Group();
        Scene scene = new Scene(root, 400, 300, Color.WHITE);

        
        primaryStage.setScene(scene);
        primaryStage.show();
        
        
        
        Stage myDialog = new MyDialog(primaryStage);
        myDialog.sizeToScene();
        myDialog.show();
  
    }
}

class MyDialog extends Stage {

    public MyDialog(Stage owner) {
        
        // Ventanita chica
        super();
        initOwner(owner);
        setTitle("Login");
        setOpacity(.90);
        Group root = new Group();
        Scene scene = new Scene(root, 250, 150, Color.WHITE);
        setScene(scene);

        // Division de la ventanita
        GridPane gridpane = new GridPane();
        gridpane.setPadding(new Insets(5));
        gridpane.setHgap(5);
        gridpane.setVgap(5);

        // Usuario
        Label userNameLbl = new Label("User Name: ");
        gridpane.add(userNameLbl, 0, 1);

        // Contraseña
        Label passwordLbl = new Label("Password: ");
        gridpane.add(passwordLbl, 0, 2);
        
        // Textfield para el usuario
        final TextField userNameFld = new TextField("Admin");
        gridpane.add(userNameFld, 1, 1);

        // Textfield para la contraseña
        final PasswordField passwordFld = new PasswordField();
        passwordFld.setText("password");
        gridpane.add(passwordFld, 1, 2);

        // Boton
        Button login = new Button("Change");
        login.setOnAction(new EventHandler<ActionEvent>() {

            public void handle(ActionEvent event) {
                close();
            }
        });
        gridpane.add(login, 1, 3);
        GridPane.setHalignment(login, HPos.RIGHT);
        root.getChildren().add(gridpane);
    }
}