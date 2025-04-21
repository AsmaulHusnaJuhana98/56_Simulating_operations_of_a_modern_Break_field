package com.example.break_field_56;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableView;

import java.time.LocalDate;

public class ViewProductionSchedule {

    @FXML
    private Button viewbtn;

    @FXML
    private DatePicker datepicker;

    @FXML
    private ComboBox<String> cbox;

    @FXML
    private TableView<?> tableview;

    // Called automatically when the FXML is loaded
    @FXML
    public void initialize() {
        // Populate combo box with example product types
        cbox.getItems().addAll("Product A", "Product B", "Product C");

        // Optionally, attach handler in code (if not using onAction in FXML)
        viewbtn.setOnAction(event -> viewSchedule());
    }

    // Handler method to display schedule based on selected filters
    private void viewSchedule() {
        LocalDate selectedDate = datepicker.getValue();
        String selectedProduct = cbox.getValue();

        // Print statements simulate loading logic
        System.out.println("Viewing schedule for:");
        System.out.println("Date: " + (selectedDate != null ? selectedDate : "Not selected"));
        System.out.println("Product: " + (selectedProduct != null ? selectedProduct : "Not selected"));

        // Placeholder: Load filtered schedule data into tableview
    }
}
