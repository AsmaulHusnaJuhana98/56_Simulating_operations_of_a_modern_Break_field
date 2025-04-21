package cse213.modernbreakfieldsimulation_simanto_inventoryclerk;


import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.chart.PieChart;
import javafx.scene.control.Alert;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;


import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;

public class RawMaterialsViewController
{

    @javafx.fxml.FXML
    private TableView<DummyTableViewClass> brickDataTableView;
    @javafx.fxml.FXML
    private PieChart brickQuantityPieChart;

    private ArrayList<BrickData> brickList;
    @FXML
    private TableColumn<DummyTableViewClass, LocalDate> rmDopTableColumn;
    @FXML
    private TableColumn<DummyTableViewClass, Integer> rmPurchasedAmountTableColumn;
    @FXML
    private TableColumn<DummyTableViewClass, Integer> rmUsedAmountTableColumn;

    @FXML
    public void initialize() {
        brickList = new ArrayList<BrickData>();
        rmPurchasedAmountTableColumn.setCellValueFactory(new PropertyValueFactory<DummyTableViewClass,Integer>("rmPurchasedAmount"));
        rmUsedAmountTableColumn.setCellValueFactory(new PropertyValueFactory<DummyTableViewClass,Integer>("rmUsedAmount"));
        rmDopTableColumn.setCellValueFactory(new PropertyValueFactory<DummyTableViewClass,LocalDate>("rmDop"));

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
        brickQuantityPieChart.getData().clear();

        // Dummy values for now
        int redBrickAmount = 1300;
        int clayBrickAmount = 2000;

        ObservableList<PieChart.Data> list = FXCollections.observableArrayList(
                new PieChart.Data("Red Brick", redBrickAmount),
                new PieChart.Data("Clay Brick", clayBrickAmount)
        );

        brickQuantityPieChart.setData(list);

        for (PieChart.Data data : brickQuantityPieChart.getData()) {
            data.getNode().addEventHandler(MouseEvent.MOUSE_CLICKED, e -> {
                Alert dataAlert = new Alert(Alert.AlertType.INFORMATION);
                dataAlert.setHeaderText(null);
                dataAlert.setContentText(
                        "Total " + data.getName() + " produced: " + (int) data.getPieValue()
                );
                dataAlert.showAndWait();
            });
        }
    }

    @FXML
    public void loadTableButtonOnMouseClicked(Event event) {
        brickDataTableView.getItems().clear();

        DummyTableViewClass d1 = new DummyTableViewClass(
                5000, // rmPurchasedAmount
                2570, // rmUsedAmount
                2430, // rmRemainingAmount
                1300, // brickProducedAmount
                900,  // brickSoldAmount
                "Red Brick", // brickType
                LocalDate.now().minusDays(12), // rmDop
                LocalDate.now().minusDays(5)   // brickDos
        );

        DummyTableViewClass d2 = new DummyTableViewClass(
                4000,
                3100,
                900,
                2000,
                1500,
                "Clay Brick",
                LocalDate.now().minusDays(8),
                LocalDate.now().minusDays(2)
        );

        brickDataTableView.getItems().addAll(d1, d2);
    }

}