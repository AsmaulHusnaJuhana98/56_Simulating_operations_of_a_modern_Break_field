package com.example.break_field_56;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TableView;
import javafx.scene.control.TableColumn;

public class AssignComplaintToDepartment {

    @FXML
    private TableView<?> tableview; // You can replace `?` with a model class like `Complaint`

    @FXML
    private TableColumn<?, ?> c1; // Optional: reference specific columns if needed

    @FXML
    private TableColumn<?, ?> c2;

    @FXML
    private ComboBox<String> cbox;

    @FXML
    private Label statuslab;

    @FXML
    private Button assignbtn;

    @FXML
    private void assignbtn() {
        String selectedDept = cbox.getValue();
        Object selectedComplaint = tableview.getSelectionModel().getSelectedItem();

        if (selectedComplaint == null || selectedDept == null) {
            statuslab.setText("Please select a complaint and a department.");
        } else {
            // Example logic: assign complaint to department
            // You can replace this with your actual assignment logic
            statuslab.setText("Complaint assigned to " + selectedDept);
        }
    }
}
