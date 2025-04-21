package com.example.break_field_56;

import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

public class ManageWorkerShifts {

    @FXML
    private ComboBox<String> cbox; // Worker selection

    @FXML
    private TextField textfield;  // Shift start and end info

    @FXML
    private Label statuslab; // Status message display

    // Handler for the shift assignment button
    @FXML
    private void shiftbtn() {
        String selectedWorker = cbox.getValue();
        String shiftInfo = textfield.getText();

        if (selectedWorker == null || selectedWorker.isEmpty()) {
            showStatus("Please select a worker.");
        } else if (shiftInfo == null || shiftInfo.isEmpty()) {
            showStatus("Please enter shift start and end time.");
        } else {
            // Simulate assigning shift
            String message = "Shift assigned to " + selectedWorker + ": " + shiftInfo;
            showStatus(message);
            showAlert("Shift Assigned", message);

            // Optional: reset fields
            cbox.setValue(null);
            textfield.clear();
        }
    }

    // Show message in status label
    private void showStatus(String message) {
        statuslab.setText(message);
    }

    // Show alert dialog
    private void showAlert(String title, String content) {
        Alert alert = new Alert(AlertType.INFORMATION);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(content);
        alert.showAndWait();
    }
}
