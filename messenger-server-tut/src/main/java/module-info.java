module com.example.messengerservertut {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.messengerservertut to javafx.fxml;
    exports com.example.messengerservertut;
}