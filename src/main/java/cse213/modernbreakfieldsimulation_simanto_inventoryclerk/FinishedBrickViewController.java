package cse213.modernbreakfieldsimulation_simanto_inventoryclerk;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.Event;
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

public class FinishedBrickViewController {

    @javafx.fxml.FXML
    private Label totalBrickProducedLabel;
    @javafx.fxml.FXML
    private Label totalBrickSoldLabel;
    @javafx.fxml.FXML
    private TableColumn<DummyTableViewClass, Integer> brickAmountTableColumn;
    @javafx.fxml.FXML
    private TableColumn<DummyTableViewClass, LocalDate> brickDosTableColumn;
    @javafx.fxml.FXML
    private TableView<DummyTableViewClass> salesDataTableView;
    @javafx.fxml.FXML
    private PieChart brickQuantityPieChart;
    @javafx.fxml.FXML
    private TableColumn<DummyTableViewClass, String> brickTypeTableColumn;

    @javafx.fxml.FXML
    public void initialize() {
        brickTypeTableColumn.setCellValueFactory(new PropertyValueFactory<>("brickType"));
        brickAmountTableColumn.setCellValueFactory(new PropertyValueFactory<>("brickSoldAmount"));
        brickDosTableColumn.setCellValueFactory(new PropertyValueFactory<>("brickDos"));
    }

    @javafx.fxml.FXML
    public void backButtonOnMouseClicked(Event event) throws IOException {
        FXMLLoader myFxmlLoader2 = new FXMLLoader(MainApplicationClass.class.getResource("RawMaterialsView.fxml"));
        Scene nextSScene = new Scene(myFxmlLoader2.load());
        Stage sameStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        sameStage.setTitle("RawMaterialsView");
        sameStage.setScene(nextSScene);
        sameStage.show();
    }

    @javafx.fxml.FXML
    public void homeButtonOnMouseClicked(Event event) throws IOException {
        FXMLLoader myFxmlLoader2 = new FXMLLoader(MainApplicationClass.class.getResource("InventoryClerkDashboardView.fxml"));
        Scene nextSScene = new Scene(myFxmlLoader2.load());
        Stage sameStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        sameStage.setTitle("Modern Brick Field Simulation");
        sameStage.setScene(nextSScene);
        sameStage.show();
    }

    @javafx.fxml.FXML
    public void brickQuantityPieChartButtonOnMouseClicked(Event event) {
        brickQuantityPieChart.getData().clear();

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

    @javafx.fxml.FXML
    public void loadSalesDataTableButtonOnMouseClicked(Event event) {
        salesDataTableView.getItems().clear();

        int totalProduced = 0;
        int totalSold = 0;

        for (int i = 0; i < 5; i++) {
            String brickType = (i % 2 == 0) ? "Red Brick" : "Clay Brick";
            int brickProducedAmount = 2000 + i * 300;
            int brickSoldAmount = 1000 + i * 150;
            LocalDate brickDos = LocalDate.now().minusDays(i);

            DummyTableViewClass d = new DummyTableViewClass();
            d.setBrickType(brickType);
            d.setBrickProducedAmount(brickProducedAmount);
            d.setBrickSoldAmount(brickSoldAmount);
            d.setBrickDos(brickDos);

            salesDataTableView.getItems().add(d);

            totalProduced += brickProducedAmount;
            totalSold += brickSoldAmount;
        }

        totalBrickProducedLabel.setText(String.valueOf(totalProduced));
        totalBrickSoldLabel.setText(String.valueOf(totalSold));
    }
}
