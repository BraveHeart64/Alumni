/*
This is a method called setOnAction that takes an ActionEvent object as its argument
and throws an IOException if an error occurs. The purpose of this method is to switch
to a different scene when a particular action is performed.

The method creates a new instance of the HelloApplication class and stores it in a variable
 called scene2. Then, it calls the next method of the HelloApplication class and passes
 the name of the FXML file ("sceneA.fxml") as an argument.

The next method is responsible for loading and displaying a new scene based on the FXML
file name passed to it. This code assumes that the HelloApplication class has a next
method that takes a String parameter representing the name of the FXML file to load.

So, when the setOnAction method is called, it creates a new instance of HelloApplication
and calls its next method to switch to the scene defined in the "sceneA.fxml" file.
 */


package com.example.login;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import java.io.IOException;

public class Bcontroller {

    @FXML
    private Button back;

    @FXML
    private Button workingstatus_bm;

    static HelloApplication scene2;

    public static HelloApplication appState(HelloApplication obj){
        scene2 = obj;
        return obj;
    }



    public void logOutButton(ActionEvent event) throws IOException
    {
        scene2.next("sceneA.fxml");

    }

    public void addWorkingStatusButton(ActionEvent event) throws IOException
    {
        scene2.next("sceneAddWorkingStatus.fxml");
    }


}