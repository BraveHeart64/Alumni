package com.example.login;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.PasswordField;
import javafx.scene.control.Alert;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.xml.crypto.Data;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Acontroller {
    @FXML
    private Label username;
    @FXML
    private Label password;
    @FXML
    private TextField name;
    @FXML
    private PasswordField key;
    @FXML
    private Button log;

    public void switchTosceneb(ActionEvent event) throws IOException {

        Connection conn = null;
        PreparedStatement stmt;

        /*try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/login", "root", "admin");
            } catch (SQLException e) {
            Alert error = new Alert(Alert.AlertType.ERROR);
            error.setTitle("Error");
            error.setHeaderText("Database connection failed.");
            error.showAndWait();
        }*/
        //---------------------------------
        String username = name.getText();
        String password = key.getText();

        if (username.equals("") || password.equals("")) {
            Alert error = new Alert(Alert.AlertType.ERROR);
            error.setTitle("Error");
            error.setHeaderText("Fill username and password");
            error.showAndWait();

        } else {
            // System.out.println(password);
            //---------------------------------
            try {
                conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/login", "root", "admin");

                // Prepare the query to retrieve the user's password from the database
                stmt = conn.prepareStatement("SELECT userName, userPassword FROM login.username where userName = ? and userPassword =?");
                stmt.setString(1, username);
                stmt.setString(2, password);


                // Execute the query and get the result set
                ResultSet rs = stmt.executeQuery();

                if (rs.next() != false) {


                    // Successful login
                    // Replace this with the code for the main application window
                    HelloApplication scene2 = new HelloApplication();
                    scene2.next("sceneB.fxml");

                } else {

                    Alert error = new Alert(Alert.AlertType.ERROR);
                    error.setTitle("Error");
                    error.setHeaderText("Incorrect username/password");
                    error.showAndWait();
                }


                // Close the result set
                rs.close();
            } catch (SQLException ex) {
                Alert error = new Alert(Alert.AlertType.ERROR);
                error.setTitle("Error");
                error.setHeaderText("Cannot Find Database");
                error.showAndWait();
            }
        }
    }
}
