module com.apaza.jamuqa {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.apaza.jamuqa to javafx.fxml;
    exports com.apaza.jamuqa;
}