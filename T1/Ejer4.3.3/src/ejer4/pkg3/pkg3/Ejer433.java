/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer4.pkg3.pkg3;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

/**
 *
 * @author Pablo Rodriguez Pino 2ºDAM
 */
public class Ejer433 extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        
        // Componentes
        Label lannual = new Label("Annual Interest Rate:  ");
        Label lnumber = new Label("Number of Years:");
        Label lloan = new Label("Loan Amount:");
        Label lmonthly = new Label("Monthly Payment:");
        Label ltotal = new Label("Total Payment:");
        
        TextField tfannual = new TextField();
        tfannual.setAlignment(Pos.CENTER_RIGHT);
        TextField tfnumber = new TextField();
        tfnumber.setAlignment(Pos.CENTER_RIGHT);
        TextField tfloan = new TextField();
        tfloan.setAlignment(Pos.CENTER_RIGHT);
        TextField tfmonthly = new TextField();
        tfmonthly.setAlignment(Pos.CENTER_RIGHT);
        TextField tftotal = new TextField();
        tftotal.setAlignment(Pos.CENTER_RIGHT);
        
        Button calculate = new Button("Calculate");   
        
        
        
        // Evento para calcular todo
        calculate.setOnAction((ActionEvent event) -> {
            double annual,number,loan,result;
            String monthlypayment,totalpayment;
            
            annual = Double.parseDouble(tfannual.getText());
            number = Double.parseDouble(tfnumber.getText());
            loan = Double.parseDouble(tfloan.getText());
            
            result = ((loan*(annual/(100*12))) / (1-(Math.pow(1+(annual/(100*12)), -12* number))));
            monthlypayment = String.valueOf(String.format("%.2f€", result));
            totalpayment = String.valueOf(String.format("%.2f€", result*12*number));

            tfmonthly.setText(monthlypayment);
            tftotal.setText(totalpayment);
            
            
            
        });
        
        
        // Creamos un GridPane y metemos los dos VBox dentro
        GridPane root = new GridPane();
        root.add(lannual,0,0);
        root.add(lnumber,0,1);
        root.add(lloan,0,2);
        root.add(lmonthly,0,3);
        root.add(ltotal,0,4);
        root.add(tfannual,1,0);
        root.add(tfnumber,1,1);
        root.add(tfloan,1,2);
        root.add(tfmonthly,1,3);
        root.add(tftotal,1,4);
        root.add(calculate,1,5);
        
        root.setAlignment(Pos.CENTER);
  
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
