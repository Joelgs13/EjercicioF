module com.example.ejerciciof {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.ejerciciof to javafx.fxml;
    exports com.example.ejerciciof;
}