package cse213.modernbreakfieldsimulation_simanto_inventoryclerk;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.time.LocalDate;

public class DummyTableViewClass {

    private int rmPurchasedAmount;
    private int rmUsedAmount;
    private int rmRemainingAmount;
    private LocalDate rmDop;


    private String brickType;


    private int brickProducedAmount;
    private int brickSoldAmount;
    private LocalDate brickDos;

    public DummyTableViewClass() {

    }

    public DummyTableViewClass(int rmPurchasedAmount, int rmUsedAmount, int rmRemainingAmount, String brickType, LocalDate rmDop) {
        this.rmPurchasedAmount = rmPurchasedAmount;
        this.rmUsedAmount = rmUsedAmount;
        this.rmRemainingAmount = rmRemainingAmount;
        this.brickType = brickType;
        this.rmDop = rmDop;
    }

    private static final ObservableList<DummyTableViewClass> items = FXCollections.observableArrayList();


    public int getRmPurchasedAmount() { return rmPurchasedAmount; }
    public void setRmPurchasedAmount(int val) { rmPurchasedAmount = val; }

    public int getRmUsedAmount() { return rmUsedAmount; }
    public void setRmUsedAmount(int val) { rmUsedAmount = val; }

    public int getRmRemainingAmount() { return rmRemainingAmount; }
    public void setRmRemainingAmount(int val) { rmRemainingAmount = val; }

    public LocalDate getRmDop() { return rmDop; }
    public void setRmDop(LocalDate val) { rmDop = val; }


    public String getBrickType() { return brickType; }
    public void setBrickType(String val) { brickType = val; }


    public int getBrickProducedAmount() { return brickProducedAmount; }
    public void setBrickProducedAmount(int val) { brickProducedAmount = val; }

    public int getBrickSoldAmount() { return brickSoldAmount; }
    public void setBrickSoldAmount(int val) { brickSoldAmount = val; }

    public LocalDate getBrickDos() { return brickDos; }
    public void setBrickDos(LocalDate val) { brickDos = val; }
}
