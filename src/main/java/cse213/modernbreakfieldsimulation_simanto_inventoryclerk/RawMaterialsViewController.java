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
import javafx.scene.control.Label;
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
    private Label totalRmRemainingLabel;
    @FXML
    private Label totalRmPurchasedLabel;
    @FXML
    private Label totalRmUsedLabel;
    @FXML
    private TableColumn<DummyTableViewClass, String> typeTableColumn;

    @FXML
    public void initialize() {
        brickList = new ArrayList<BrickData>();
        rmPurchasedAmountTableColumn.setCellValueFactory(new PropertyValueFactory<DummyTableViewClass,Integer>("rmPurchasedAmount"));
        rmUsedAmountTableColumn.setCellValueFactory(new PropertyValueFactory<DummyTableViewClass,Integer>("rmUsedAmount"));
        rmDopTableColumn.setCellValueFactory(new PropertyValueFactory<DummyTableViewClass,LocalDate>("rmDop"));
        typeTableColumn.setCellValueFactory(new PropertyValueFactory<>("brickType"));
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

        int totalPurchased = 0;
        int totalUsed = 0;
        int totalRemaining = 0;


        for (int i = 0; i < 5; i++) {
            int rmPurchasedAmount = 5000 + i * 100; // Example
            int rmUsedAmount = 2500 + i * 50;
            int rmRemainingAmount = rmPurchasedAmount - rmUsedAmount;
            String brickType = (i % 2 == 0) ? "Red Brick" : "Clay Brick";
            LocalDate rmDop = LocalDate.now().minusDays(i);

            DummyTableViewClass d = new DummyTableViewClass(
                    rmPurchasedAmount,
                    rmUsedAmount,
                    rmRemainingAmount,
                    brickType,
                    rmDop
            );

            brickDataTableView.getItems().add(d);

            totalPurchased += rmPurchasedAmount;
            totalUsed += rmUsedAmount;
            totalRemaining += rmRemainingAmount;
        }

        totalRmPurchasedLabel.setText("" + totalPurchased);
        totalRmUsedLabel.setText("" + totalUsed);
        totalRmRemainingLabel.setText("" + totalRemaining);
    }

}