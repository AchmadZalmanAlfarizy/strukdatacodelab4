module com.example.demo4sd {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.demo4sd to javafx.fxml;
    exports com.example.demo4sd;
}