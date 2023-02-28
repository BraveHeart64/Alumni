package com.example.alumni;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;
import java.io.IOException;

public class HelloApplication extends Application  {
    private static Stage x;

    @Override
    public void start(Stage stage) throws IOException {
        x = stage;
        stage.setResizable(false); // the false statement disables the size
        Parent root = FXMLLoader.load(getClass().getResource("sceneA.fxml"));
        stage.setScene(new Scene(root, 800, 500));
        stage.setTitle("My App"); //stage title
        stage.show();
    }

    public void next(String fxml) throws IOException {
        Parent pane = FXMLLoader.load(getClass().getResource(fxml));
        x.getScene().setRoot(pane);
    }


    public static void main(String[] args) {
        launch();
    }
}