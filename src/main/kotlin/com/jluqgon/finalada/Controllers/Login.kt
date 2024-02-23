package com.jluqgon.finalada.Controllers

import com.jluqgon.finalada.HelloApplication
import javafx.fxml.FXML
import javafx.fxml.FXMLLoader
import javafx.fxml.Initializable
import javafx.scene.Scene
import java.net.URL
import java.util.*

class Login: Initializable {
    override fun initialize(p0: URL?, p1: ResourceBundle?) {
        println("Boton Inicio Sesion Inicio")
    }

    @FXML
    fun loginbuttonClick() {
        val fxmlLoader = FXMLLoader(HelloApplication::class.java.getResource("homeScreen.fxml"))
        val scene = Scene(fxmlLoader.load(), 320.0, 240.0)

        createStage(scene)
    }

}