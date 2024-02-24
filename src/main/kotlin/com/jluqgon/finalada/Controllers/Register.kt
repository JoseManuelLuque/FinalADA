package com.jluqgon.finalada.Controllers

import com.jluqgon.finalada.HelloApplication
import javafx.fxml.FXMLLoader
import javafx.fxml.Initializable
import javafx.scene.Scene
import javafx.stage.Stage
import java.net.URL
import java.util.*

class Register: Initializable {
    override fun initialize(p0: URL?, p1: ResourceBundle?) {
        println("Boton Registrar Inicio")
    }

    fun onBackButtonClick() {
        val fxmlLoader = FXMLLoader(HelloApplication::class.java.getResource("StartScreen.fxml"))
        val scene = Scene(fxmlLoader.load(), 320.0, 240.0)
        createStage(scene)
    }
}