module com.alilopez.com {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.alilopez.com to javafx.fxml;
    exports com.alilopez.com;
    exports com.alilopez.com.controllers;
    opens com.alilopez.com.controllers to javafx.fxml;
}