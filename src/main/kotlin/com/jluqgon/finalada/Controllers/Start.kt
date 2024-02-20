package com.jluqgon.finalada.Controllers

import com.jluqgon.finalada.HelloApplication
import javafx.fxml.FXML
import javafx.fxml.FXMLLoader
import javafx.scene.Scene
import javafx.scene.control.Label
import javafx.stage.Stage

class Start {
    @FXML
    private lateinit var welcomeText: Label

    @FXML
    private fun onHelloButtonClick() {
        welcomeText.text = "Welcome to JavaFX Application!"
    }

    @FXML
    fun iniciarSesionClick(){
        val fxmlLoader = FXMLLoader(HelloApplication::class.java.getResource("loginScreen.fxml"))
        val scene = Scene(fxmlLoader.load(), 320.0, 240.0)

        val stage = Stage()
        stage.title = "Inicio de sesio"
        stage.show()
    }
}