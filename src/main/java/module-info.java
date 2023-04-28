module com.example.playon {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens com.example.playon to javafx.fxml;
    exports com.example.playon;
}