package com.example.break_field_56;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;

public class RequestMaintenance {

    @FXML
    private ComboBox<String> cbox;

    @FXML
    private TextArea textarea;

    @FXML
    private Label confirmationlab;

    // Initialize method to populate ComboBox (if needed)
    @FXML
    public void initialize() {
        // Example of populating ComboBox with equipment options
        cbox.getItems().addAll("Equipment 1", "Equipment 2", "Equipment 3");
    }

    // Handler method for the "Click for submit request" button
    @FXML
    private void requestbtn(ActionEvent event) {
        String selectedEquipment = cbox.getValue();
        String issueDescription = textarea.getText();

        // Check if both fields are filled
        if (selectedEquipment != null && !issueDescription.isEmpty()) {
            confirmationlab.setText("Request submitted for " + selectedEquipment);
        } else {
            confirmationlab.setText("Please fill in both fields.");
        }
    }
}
