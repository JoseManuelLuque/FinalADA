package com.jluqgon.finalada.Controllers

import com.jluqgon.finalada.HelloApplication
import javafx.fxml.FXMLLoader
import javafx.fxml.Initializable
import javafx.scene.Scene
import java.net.URL
import java.util.*

class Home: Initializable {
    override fun initialize(p0: URL?, p1: ResourceBundle?) {
        println("Boton Home Inicio")
    }

    fun onBookingButtonClick() {
        val fxmlLoader = FXMLLoader(HelloApplication::class.java.getResource("BookingScreen.fxml"))
        val scene = Scene(fxmlLoader.load(), 320.0, 240.0)

        createStage(scene)
    }

    fun onManageBookingsClick() {
        val fxmlLoader = FXMLLoader(HelloApplication::class.java.getResource("YourBookingsScreen.fxml"))
        val scene = Scene(fxmlLoader.load(), 320.0, 240.0)

        createStage(scene)
    }
}