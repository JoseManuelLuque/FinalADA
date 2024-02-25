package com.jluqgon.finalada

import com.jluqgon.finalada.Classes.Connect
import com.jluqgon.finalada.Classes.User
import jakarta.persistence.EntityManager
import jakarta.persistence.EntityManagerFactory
import jakarta.persistence.Persistence
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
//    val connect = Connect()
//    connect.connectToDatabase()

    val entityManagerFactory: EntityManagerFactory = Persistence.createEntityManagerFactory("FinalADA")
    val entityManager: EntityManager = entityManagerFactory.createEntityManager()

    val usuario = User(0, "Paco", "Paco", "Paco@gmail.com")

    entityManager.transaction.begin()
    entityManager.persist(usuario)
    entityManager.transaction.commit()

    val personas: List<User> = entityManager.createQuery("FROM User ", User::class.java).resultList
    println("Número de Usuarios " + personas.size)

    entityManager.close()
    entityManagerFactory.close()

}