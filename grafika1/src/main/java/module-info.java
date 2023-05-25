module graf.grafika1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens graf.grafika1 to javafx.fxml;
    exports graf.grafika1;
}