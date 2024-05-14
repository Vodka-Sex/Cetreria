/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */
package Hilos_Cetreria;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author softw
 */
public class Hilos_Cetreria extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        
        Pantalla pantalla = new Pantalla();
        pantalla.setVisible(true);
    }

 
    public static void main(String[] args) {
        launch(args);
    }
    
}
