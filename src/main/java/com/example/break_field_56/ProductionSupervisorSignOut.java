package com.example.break_field_56;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class ProductionSupervisorSignOut {

    @FXML
    private Label confirmationlab;

    // Called when the "Sign out" button is clicked
    @FXML
    private void signoutbtn() {
        // Display confirmation prompt
        confirmationlab.setText("Are you sure you want to sign out?");
    }

    // Called when the "Confirm/Cancel" button is clicked
    @FXML
    private void confirmcancelbtn() {
        // For demonstration, you can modify based on logic like confirmation or cancel
        confirmationlab.setText("You have successfully signed out.");
        // Or if cancel:
        // confirmationlab.setText("Sign out canceled.");
    }
}
