module com.example.messengerclienttut {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.messengerclienttut to javafx.fxml;
    exports com.example.messengerclienttut;
}