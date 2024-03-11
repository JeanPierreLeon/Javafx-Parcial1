module co.edu.uniquindio.parcial1fx.empresaapp {
    requires javafx.controls;
    requires javafx.fxml;


    opens co.edu.uniquindio.parcial1fx.empresaapp to javafx.fxml;
    exports co.edu.uniquindio.parcial1fx.empresaapp;
}