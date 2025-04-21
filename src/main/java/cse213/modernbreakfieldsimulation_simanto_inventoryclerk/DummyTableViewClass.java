package cse213.modernbreakfieldsimulation_simanto_inventoryclerk;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.time.LocalDate;

public class DummyTableViewClass {
    private int rmPurchasedAmount;
    private int rmUsedAmount;
    private int rmRemainingAmount;
    private String brickType;
    private LocalDate rmDop;


    public DummyTableViewClass(int rmPurchasedAmount, int rmUsedAmount, int rmRemainingAmount, String brickType, LocalDate rmDop) {
        this.rmPurchasedAmount = rmPurchasedAmount;
        this.rmUsedAmount = rmUsedAmount;
        this.rmRemainingAmount = rmRemainingAmount;
        this.brickType = brickType;
        this.rmDop = rmDop;
    }

    private static final ObservableList<DummyTableViewClass> items = FXCollections.observableArrayList();


    // Getters & setters
    public int getRmPurchasedAmount() { return rmPurchasedAmount; }
    public void setRmPurchasedAmount(int val) { rmPurchasedAmount = val; }

    public int getRmUsedAmount() { return rmUsedAmount; }
    public void setRmUsedAmount(int val) { rmUsedAmount = val; }

    public int getRmRemainingAmount() { return rmRemainingAmount; }
    public void setRmRemainingAmount(int val) { rmRemainingAmount = val; }

    public String getBrickType() { return brickType; }
    public void setBrickType(String val) { brickType = val; }

    public LocalDate getRmDop() { return rmDop; }
    public void setRmDop(LocalDate val) { rmDop = val; }
}