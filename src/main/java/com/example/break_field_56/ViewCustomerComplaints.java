package com.example.break_field_56;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableView;

public class ViewCustomerComplaints {

    @FXML
    private ComboBox<String> cbox;

    @FXML
    private TableView<?> tableview;

    // Called automatically after FXML is loaded
    @FXML
    public void initialize() {
        // Populate combo box with sample filter options
        cbox.getItems().addAll("Product Issue", "Service Delay", "Billing Error");
    }

    // Handler for the "Click for View complaints" button
    @FXML
    private void viewbtn(ActionEvent event) {
        String selectedFilter = cbox.getValue();

        if (selectedFilter == null || selectedFilter.isBlank()) {
            System.out.println("Viewing all unsolved complaints.");
        } else {
            System.out.println("Filtering complaints by: " + selectedFilter);
        }

        // Placeholder for actual complaint data fetching logic
        System.out.println("Complaints loaded into table view.");
    }
}
