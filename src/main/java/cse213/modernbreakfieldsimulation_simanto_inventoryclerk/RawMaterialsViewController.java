package cse213.modernbreakfieldsimulation_simanto_inventoryclerk;


import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.chart.PieChart;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;


import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;

public class RawMaterialsViewController
{

    @javafx.fxml.FXML
    private TableView<BrickData> brickDataTableView;
    @javafx.fxml.FXML
    private PieChart brickQuantityPieChart;

    private ArrayList<BrickData> brickList;
    @FXML
    private TableColumn<BrickData, LocalDate> rmDopTableColumn;
    @FXML
    private TableColumn<BrickData, Integer> rmPurchasedAmountTableColumn;
    @FXML
    private TableColumn<BrickData, Integer> rmUsedAmountTableColumn;

    @FXML
    public void initialize() {
        brickList = new ArrayList<BrickData>();
        rmPurchasedAmountTableColumn.setCellValueFactory(new PropertyValueFactory<BrickData,Integer>("rmPurchasedAmount"));
        rmUsedAmountTableColumn.setCellValueFactory(new PropertyValueFactory<BrickData,Integer>("rmUsedAmount"));
        rmDopTableColumn.setCellValueFactory(new PropertyValueFactory<BrickData,LocalDate>("rmDop"));

    }

    @Deprecated
    public void updateButtonOnMouseClicked(Event event) {
    }

    @javafx.fxml.FXML
    public void homeButtonOnMouseClicked(Event event) throws IOException {
        FXMLLoader myFxmlLoader2 = new FXMLLoader(MainApplicationClass.class.getResource("InventoryClerkDashboardView.fxml"));
        Scene nextSScene = new Scene(myFxmlLoader2.load());
        Stage sameStage;
        sameStage = (Stage)((Node) event.getSource()).getScene().getWindow();
        sameStage.setTitle("Modern Brick Field Simulation");
        sameStage.setScene(nextSScene);
        sameStage.show();
    }

    @javafx.fxml.FXML
    public void backButtonOnMouseClicked(Event event) throws IOException {
        FXMLLoader myFxmlLoader2 = new FXMLLoader(MainApplicationClass.class.getResource("InventoryClerkDashboardView.fxml"));
        Scene nextSScene = new Scene(myFxmlLoader2.load());
        Stage sameStage;
        sameStage = (Stage)((Node) event.getSource()).getScene().getWindow();
        sameStage.setTitle("Modern Brick Field Simulation");
        sameStage.setScene(nextSScene);
        sameStage.show();
    }

    @javafx.fxml.FXML
    public void brickQuantityPieChartButtonOnMouseClicked(Event event) {
    }

    @FXML
    public void loadTableButtonOnMouseClicked(Event event) {
    }
}