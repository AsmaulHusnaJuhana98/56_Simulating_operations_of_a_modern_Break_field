package com.example.break_field_56;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;

public class LogNewCustomerComplaint {

    @FXML
    private TextField textfield; // Customer name

    @FXML
    private TextArea textarea;  // Issue description

    // Handler method for submit button
    @FXML
    private void submitbtn() {
        String customerName = textfield.getText();
        String issueDescription = textarea.getText();

        if (customerName == null || customerName.isEmpty() || issueDescription == null || issueDescription.isEmpty()) {
            showAlert("Both customer name and issue description must be filled.");
        } else {
            // Simulate saving to the database
            showAlert("Complaint submitted for " + customerName + ".\nIssue: " + issueDescription);

            // Optionally clear fields after submission
            textfield.clear();
            textarea.clear();
        }
    }

    // Utility method to show an alert
    private void showAlert(String message) {
        Alert alert = new Alert(AlertType.INFORMATION);
        alert.setTitle("Complaint Submission");
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }
}
