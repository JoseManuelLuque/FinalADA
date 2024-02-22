module com.jluqgon.finalada {
    requires javafx.controls;
    requires javafx.fxml;
    requires kotlin.stdlib;
    requires jakarta.persistence;


    opens com.jluqgon.finalada to javafx.fxml;
    exports com.jluqgon.finalada;
    opens com.jluqgon.finalada.Controllers;
    exports com.jluqgon.finalada.Controllers;
}