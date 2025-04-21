package com.example.break_field_56;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TableView;
import javafx.scene.control.TableColumn;

public class AssignTasksToWorkers {

    @FXML
    private TableColumn<?, ?> tableview;  // This is a column, not a TableView. Adjust name if needed.

    @FXML
    private ComboBox<String> cbox;

    @FXML
    private Label confirmationlab;

    @FXML
    private Button assignbtn;

    @FXML
    private void assignbtn() {
        // Dummy data handling logic
        String selectedWorker = cbox.getValue();

        if (selectedWorker == null) {
            confirmationlab.setText("Please select a worker.");
        } else {
            // Example task assignment logic
            confirmationlab.setText("Task assigned to: " + selectedWorker);
        }
    }
}
