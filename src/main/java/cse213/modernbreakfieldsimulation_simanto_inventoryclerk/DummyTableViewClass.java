package cse213.modernbreakfieldsimulation_simanto_inventoryclerk;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.time.LocalDate;

public class DummyTableViewClass {
    private int rmPurchasedAmount;
    private int rmUsedAmount;
    private int rmRemainingAmount;
    private int brickProducedAmount;
    private int brickSoldAmount;
    private String brickType;
    private LocalDate rmDop;
    private LocalDate brickDos;


    private static final ObservableList<DummyTableViewClass> items = FXCollections.observableArrayList();

    public DummyTableViewClass(int rmPurchasedAmount, int rmUsedAmount, int rmRemainingAmount, int brickProducedAmount, int brickSoldAmount, String brickType, LocalDate rmDop, LocalDate brickDos) {
        this.rmPurchasedAmount = rmPurchasedAmount;
        this.rmUsedAmount = rmUsedAmount;
        this.rmRemainingAmount = rmRemainingAmount;
        this.brickProducedAmount = brickProducedAmount;
        this.brickSoldAmount = brickSoldAmount;
        this.brickType = brickType;
        this.rmDop = rmDop;
        this.brickDos = brickDos;
    }

    public int getRmPurchasedAmount() {
        return rmPurchasedAmount;
    }

    public void setRmPurchasedAmount(int rmPurchasedAmount) {
        this.rmPurchasedAmount = rmPurchasedAmount;
    }

    public int getRmUsedAmount() {
        return rmUsedAmount;
    }

    public void setRmUsedAmount(int rmUsedAmount) {
        this.rmUsedAmount = rmUsedAmount;
    }

    public int getRmRemainingAmount() {
        return rmRemainingAmount;
    }

    public void setRmRemainingAmount(int rmRemainingAmount) {
        this.rmRemainingAmount = rmRemainingAmount;
    }

    public int getBrickProducedAmount() {
        return brickProducedAmount;
    }

    public void setBrickProducedAmount(int brickProducedAmount) {
        this.brickProducedAmount = brickProducedAmount;
    }

    public int getBrickSoldAmount() {
        return brickSoldAmount;
    }

    public void setBrickSoldAmount(int brickSoldAmount) {
        this.brickSoldAmount = brickSoldAmount;
    }

    public String getBrickType() {
        return brickType;
    }

    public void setBrickType(String brickType) {
        this.brickType = brickType;
    }

    public LocalDate getRmDop() {
        return rmDop;
    }

    public void setRmDop(LocalDate rmDop) {
        this.rmDop = rmDop;
    }

    public LocalDate getBrickDos() {
        return brickDos;
    }

    public void setBrickDos(LocalDate brickDos) {
        this.brickDos = brickDos;
    }
}
