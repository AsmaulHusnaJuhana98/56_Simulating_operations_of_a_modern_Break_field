package com.example.break_field_56;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class TrackComplaintResolution {

    @FXML
    private TextField textfield;

    @FXML
    private Label statuslab;

    @FXML
    private Label notificationlab;

    // Handler for the "Click for track" button
    @FXML
    private void trackbtn(ActionEvent event) {
        String complaintId = textfield.getText();

        if (complaintId == null || complaintId.isBlank()) {
            statuslab.setText("Please enter a complaint ID.");
            notificationlab.setText("No status available.");
            return;
        }

        // Simulated tracking logic (you can replace with real data lookup)
        statuslab.setText("Status for ID " + complaintId + ": In Progress");
        notificationlab.setText("Customer notified via email.");
    }
}
