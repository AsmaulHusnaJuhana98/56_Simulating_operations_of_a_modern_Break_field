package com.example.break_field_56;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class CustomerSupportSignOut {

    @FXML
    private Label confirmationlab;

    @FXML
    private Button signoutbtn;

    @FXML
    private Button confirmcancelbtn;

    @FXML
    private void signoutbtn() {
        // Show confirmation message
        confirmationlab.setText("Are you sure you want to sign out?");
    }

    @FXML
    private void confirmcancelbtn() {
        // Logic to handle confirmation
        // You can implement real redirect/logout logic here
        confirmationlab.setText("Signed out successfully.");

        // Example redirect logic (if using scenes):
        // App.setRoot("LoginScreen"); // You'd need to define a scene switch method
    }
}
