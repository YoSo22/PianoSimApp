package com.piano.pianosimapp;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;

import javafx.stage.Stage;



public class Piano extends Application {


    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Piano View.fxml"));
        Scene scene = new Scene(fxmlLoader.load(),700.0 , 489.0);
        stage.setTitle("Piano");
        stage.setScene(scene);
        stage.show();
    }

    private static void main(String[] args) {
        launch();
    }


}
