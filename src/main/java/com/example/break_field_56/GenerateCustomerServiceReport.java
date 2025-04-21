package com.example.break_field_56;

import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

public class GenerateCustomerServiceReport {

    @FXML
    private ComboBox<String> cbox;

    @FXML
    private DatePicker datepicker;

    // Handler for "Click for generate" button
    @FXML
    private void generatebtn() {
        String reportType = cbox.getValue();
        String toDate = (datepicker.getValue() != null) ? datepicker.getValue().toString() : null;

        if (reportType == null || toDate == null) {
            showAlert("Please select a report type and date.");
        } else {
            // Dummy logic for generating a report
            showAlert("Generating report: " + reportType + " up to " + toDate);
        }
    }

    // Handler for "Click for export pdf" button
    @FXML
    private void exportbtn() {
        // Dummy export logic
        showAlert("Report exported as PDF.");
    }

    // Utility method to display messages
    private void showAlert(String message) {
        Alert alert = new Alert(AlertType.INFORMATION);
        alert.setTitle("Report Generation");
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }
}
