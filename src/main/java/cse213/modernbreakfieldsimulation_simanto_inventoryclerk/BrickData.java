package cse213.modernbreakfieldsimulation_simanto_inventoryclerk;

import java.time.LocalDate;

public class BrickData {
    protected int rmPurchasedAmount, rmUsedAmount, rmRemainingAmount, brickProducedAmount, brickSoldAmount;
    protected String brickType;
    protected LocalDate rmDop,brickDos;

    public BrickData() {
        rmPurchasedAmount=rmUsedAmount=rmRemainingAmount=brickProducedAmount=brickSoldAmount=0;
        brickType="TBA";
        rmDop=brickDos=null;

    }

    public BrickData(LocalDate brickDos, LocalDate rmDop, String brickType, int brickSoldAmount, int brickProducedAmount, int rmRemainingAmount, int rmUsedAmount, int rmPurchasedAmount) {
        this.brickDos = brickDos;
        this.rmDop = rmDop;
        this.brickType = brickType;
        this.brickSoldAmount = brickSoldAmount;
        this.brickProducedAmount = brickProducedAmount;
        this.rmRemainingAmount = rmRemainingAmount;
        this.rmUsedAmount = rmUsedAmount;
        this.rmPurchasedAmount = rmPurchasedAmount;
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

    @Override
    public String toString() {
        return "BrickData{" +
                "rmPurchasedAmount=" + rmPurchasedAmount +
                ", rmUsedAmount=" + rmUsedAmount +
                ", rmRemainingAmount=" + rmRemainingAmount +
                ", brickProducedAmount=" + brickProducedAmount +
                ", brickSoldAmount=" + brickSoldAmount +
                ", brickType='" + brickType + '\'' +
                ", rmDop=" + rmDop +
                ", brickDos=" + brickDos +
                '}';
    }
}
