package com.example.login;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

import java.io.IOException;

public class AddWorkingStatuscontroller extends Bcontroller {

    @FXML
    Button backmainmenu_bm;





    public void setBackmainmenu_bm(ActionEvent event) throws IOException
    {

        scene2.next("sceneB.fxml");

    }

}
