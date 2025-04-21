package com.example.break_field_56;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Alert.AlertType;

public class GenerateProductionReports {

    @FXML
    private DatePicker datepicker;

    @FXML
    private ComboBox<String> cbox;

    // Handler for the "Click for generate report" button
    @FXML
    private void grneratebtn() {
        String selectedDate = (datepicker.getValue() != null) ? datepicker.getValue().toString() : null;
        String reportType = cbox.getValue();

        if (selectedDate == null || reportType == null) {
            showAlert("Please select both the date and report type.");
        } else {
            // Simulate report generation
            showAlert("Report generated: " + reportType + " up to " + selectedDate);
        }
    }

    // Utility method for displaying information messages
    private void showAlert(String message) {
        Alert alert = new Alert(AlertType.INFORMATION);
        alert.setTitle("Production Report");
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }
}
