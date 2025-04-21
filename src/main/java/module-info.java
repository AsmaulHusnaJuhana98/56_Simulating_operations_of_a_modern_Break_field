module cse213.modernbreakfieldsimulation_simanto_inventoryclerk {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens cse213.modernbreakfieldsimulation_simanto_inventoryclerk to javafx.fxml;
    exports cse213.modernbreakfieldsimulation_simanto_inventoryclerk;
}