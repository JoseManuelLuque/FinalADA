package com.jluqgon.finalada

import com.jluqgon.finalada.Classes.Connect
import javafx.application.Application
import javafx.fxml.FXMLLoader
import javafx.scene.Scene
import javafx.stage.Stage

class HelloApplication : Application() {
    override fun start(stage: Stage) {
        val fxmlLoader = FXMLLoader(HelloApplication::class.java.getResource("startScreen.fxml"))
        val scene = Scene(fxmlLoader.load(), 320.0, 240.0)
        val stage = Stage()
        stage.scene = scene
        stage.width = 800.0
        stage.height = 600.0
        stage.isResizable = false
        stage.title = "App Gestor de Datos"
        stage.show()
    }
}

fun main() {
    Application.launch(HelloApplication::class.java)
    val connect = Connect()
    connect.connectToDatabase()
}