package com.example.break_field_56;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class MonitorResourceAvailability {

    @FXML
    private TableView<Resource> tableview;

    @FXML
    private Label statuslab;

    // Called when "Click to check resources status" button is clicked
    @FXML
    private void resourcesbtn() {
        // Mock data to simulate resource availability
        ObservableList<Resource> resources = FXCollections.observableArrayList(
                new Resource("Steel", "Available"),
                new Resource("Machine A", "Maintenance"),
                new Resource("Plastic", "Low Stock")
        );

        // Configure table columns
        if (tableview.getColumns().size() >= 2) {
            TableColumn<Resource, String> col1 = (TableColumn<Resource, String>) tableview.getColumns().get(0);
            TableColumn<Resource, String> col2 = (TableColumn<Resource, String>) tableview.getColumns().get(1);

            col1.setCellValueFactory(new PropertyValueFactory<>("name"));
            col2.setCellValueFactory(new PropertyValueFactory<>("status"));
        }

        tableview.setItems(resources);
        statuslab.setText("Resources status updated.");
    }

    // Inner class to represent a resource
    public static class Resource {
        private String name;
        private String status;

        public Resource(String name, String status) {
            this.name = name;
            this.status = status;
        }

        public String getName() {
            return name;
        }

        public String getStatus() {
            return status;
        }
    }
}
