package com.jluqgon.finalada

import com.jluqgon.finalada.Classes.Connect
import com.jluqgon.finalada.Classes.Hotels
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
    //Application.launch(HelloApplication::class.java)
    val connect = Connect()
    connect.connectToDatabase()

    val entityManagerFactory: EntityManagerFactory = Persistence.createEntityManagerFactory("FinalADA")
    val entityManager: EntityManager = entityManagerFactory.createEntityManager()

    val usuario = User()
    usuario.setName("Paco")
    usuario.setEmail("Paco@gmail.com")
    usuario.setPassword("Paco")

    var hotel = Hotels()
    hotel.hotelName = "HOTEL"
    hotel.adress = "AAA"
    hotel.stars = 5

    entityManager.transaction.begin()
    entityManager.persist(usuario)
    entityManager.persist(hotel)
    entityManager.transaction.commit()

//    val usuarios: List<User> = entityManager.createQuery("SELECT User FROM usuarios", User::class.java).resultList
//    println("Número de Usuarios " + personas.size)

    entityManager.close()
    entityManagerFactory.close()

}