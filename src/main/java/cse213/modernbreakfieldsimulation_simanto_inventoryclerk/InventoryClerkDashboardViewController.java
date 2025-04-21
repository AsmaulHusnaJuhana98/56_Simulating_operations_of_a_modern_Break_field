package cse213.modernbreakfieldsimulation_simanto_inventoryclerk;

import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class InventoryClerkDashboardViewController
{
    @javafx.fxml.FXML
    private Label userNameLabel;
    @javafx.fxml.FXML
    private Label userIdLabel;
    @javafx.fxml.FXML
    private AnchorPane inventoryClerkDashboardAnchorPlane;
    @javafx.fxml.FXML
    private BorderPane inventoryClerkDashboardBorderPlane;

    private void loadFxmlParentToBorderPaneCenter(String fxmlName) throws IOException {
        FXMLLoader nextFxmlLoader = new FXMLLoader(MainApplicationClass.class.getResource(fxmlName));
        inventoryClerkDashboardBorderPlane.setCenter(nextFxmlLoader.load());
    }

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void logOutButtonOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void rawMaterialsButtonOnMouseClicked(Event event) throws IOException {
//        FXMLLoader myFxmlLoader2 = new FXMLLoader(MainApplicationClass.class.getResource("RawMaterialsView.fxml"));
//        Scene nextSScene = new Scene(myFxmlLoader2.load());
//        Stage sameStage;
//        sameStage = (Stage)((Node) event.getSource()).getScene().getWindow();
//        sameStage.setTitle("Modern Brick Field Simulation");
//        sameStage.setScene(nextSScene);
//        sameStage.show();

//        Parent parent = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("RawMaterialsView.fxml")));
//        inventoryClerkDashboardBorderPlane.setCenter(parent);

        loadFxmlParentToBorderPaneCenter("RawMaterialsView.fxml");
    }

    @javafx.fxml.FXML
    public void updateRawMaterialButtonOnMouseClicked(Event event) throws IOException {
//        FXMLLoader myFxmlLoader2 = new FXMLLoader(MainApplicationClass.class.getResource("UpdateRawMaterialView.fxml"));
//        Scene nextSScene = new Scene(myFxmlLoader2.load());
//        Stage sameStage;
//        sameStage = (Stage)((Node) event.getSource()).getScene().getWindow();
//        sameStage.setTitle("Modern Brick Field Simulation");
//        sameStage.setScene(nextSScene);
//        sameStage.show();

        loadFxmlParentToBorderPaneCenter("UpdateRawMaterialView.fxml");
    }

    @javafx.fxml.FXML
    public void finishedBrickButtonOnMouseClicked(Event event) throws IOException {
//        FXMLLoader myFxmlLoader2 = new FXMLLoader(MainApplicationClass.class.getResource("FinishedBrickView.fxml"));
//        Scene nextSScene = new Scene(myFxmlLoader2.load());
//        Stage sameStage;
//        sameStage = (Stage)((Node) event.getSource()).getScene().getWindow();
//        sameStage.setTitle("Modern Brick Field Simulation");
//        sameStage.setScene(nextSScene);
//        sameStage.show();

        loadFxmlParentToBorderPaneCenter("FinishedBrickView.fxml");
    }

    @javafx.fxml.FXML
    public void reportsButtonOnMouseClicked(Event event) throws IOException {
//        FXMLLoader myFxmlLoader2 = new FXMLLoader(MainApplicationClass.class.getResource("ReportsView.fxml"));
//        Scene nextSScene = new Scene(myFxmlLoader2.load());
//        Stage sameStage;
//        sameStage = (Stage)((Node) event.getSource()).getScene().getWindow();
//        sameStage.setTitle("Modern Brick Field Simulation");
//        sameStage.setScene(nextSScene);
//        sameStage.show();

        loadFxmlParentToBorderPaneCenter("ReportsView.fxml");

    }
}