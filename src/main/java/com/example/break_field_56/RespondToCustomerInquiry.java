package com.example.break_field_56;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TextField;

public class RespondToCustomerInquiry {

    @FXML
    private TableColumn<?, ?> tableview;

    @FXML
    private TextField textfield;

    @FXML
    private CheckBox checkbox;

    // Handler for the "Submit response" button
    @FXML
    private void responsebtn(ActionEvent event) {
        String responseText = textfield.getText();
        boolean isResolved = checkbox.isSelected();

        // Simulate processing the response
        System.out.println("Response submitted: " + responseText);
        System.out.println("Marked as resolved: " + isResolved);

        // Clear input (optional)
        textfield.clear();
        checkbox.setSelected(false);
    }

    // Handler for checkbox click (if you want to respond to checkbox separately)
    @FXML
    private void checkbox(ActionEvent event) {
        boolean isChecked = checkbox.isSelected();
        System.out.println("Checkbox status: " + isChecked);
    }
}
