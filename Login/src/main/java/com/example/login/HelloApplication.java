/*
This is a JavaFX application with a HelloApplication class that extends the Application class.

The start method is the entry point for the application and is called when the application is launched.
It initializes the main stage of the application by loading an FXML file called "sceneA.fxml" using the
FXMLLoader class, sets the title of the stage, and shows the stage to the user. The method also sets the
stage to be non-resizable with the setResizable method.

The next method is called when the application needs to switch to a different scene defined in another
FXML file. This method loads the new FXML file using the FXMLLoader class and sets it as the root of
the scene of the Stage object stored in the static variable x.

The main method is the entry point for the Java program and calls the launch method which starts the JavaFX
application.

The static variable x is declared at the class level, outside of any method, and is used to store a reference
to the Stage object. This allows the next method to access the stage of the application and switch to a different scene.

Overall, this code sets up a basic JavaFX application with a main stage that can be switched to different
scenes defined in FXML files.
 */


package com.example.login;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;
import java.sql.Connection;


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

