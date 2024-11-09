package com.example.ejerciciof;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;

public class EjercicioFApp extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(EjercicioFApp.class.getResource("EjercicioF.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 800, 500);
        Image icon = new Image(getClass().getResourceAsStream("/iconos/cuaderno.png"));
        stage.getIcons().add(icon);
        stage.setMaxWidth(840);
        stage.setMinWidth(565);
        stage.setMinHeight(325);
        stage.setTitle("Ejercicio F!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}