package com.example.break_field_56;

import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

public class EscalateUnresolvedIssue {

    @FXML
    private TableView<?> tableview;  // Ideally, replace `?` with your complaint model class

    @FXML
    private ComboBox<String> cbox;

    // Called when "Click for mark for escalation" is clicked
    @FXML
    private void escalationbtn() {
        Object selectedComplaint = tableview.getSelectionModel().getSelectedItem();

        if (selectedComplaint == null) {
            showAlert("Please select a complaint to escalate.");
        } else {
            showAlert("Complaint marked for escalation.");
        }
    }

    // Called when "Click for notify" is clicked
    @FXML
    private void notifybtn() {
        String selectedManager = cbox.getValue();

        if (selectedManager == null) {
            showAlert("Please select a manager to notify.");
        } else {
            showAlert("Manager " + selectedManager + " has been notified.");
        }
    }

    // Helper method for showing alerts
    private void showAlert(String message) {
        Alert alert = new Alert(AlertType.INFORMATION);
        alert.setTitle("Escalation Notification");
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }
}
