package com.example.break_field_56;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class UpdateProductionStatus {

    @FXML
    private ComboBox<String> combox;

    @FXML
    private TextField textfield;

    @FXML
    private Label updatestatus;

    // This method runs automatically when the FXML loads
    @FXML
    public void initialize() {
        // Populate combo box with sample production tasks
        combox.getItems().addAll("Task A", "Task B", "Task C");
    }

    // Handler method for "Click save" button
    @FXML
    private void savebtn(ActionEvent event) {
        String selectedTask = combox.getValue();
        String progressUpdate = textfield.getText();

        if (selectedTask == null || progressUpdate.isBlank()) {
            updatestatus.setText("Please select a task and enter progress.");
        } else {
            updatestatus.setText("Progress for " + selectedTask + " updated to: " + progressUpdate);
        }

        // Optional: clear inputs after submission
        // combox.setValue(null);
        // textfield.clear();
    }
}
