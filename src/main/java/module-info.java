module com.example.hmyzuloha {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens com.example.hmyzuloha to javafx.fxml;
    exports com.example.hmyzuloha;
}