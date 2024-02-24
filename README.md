# Proyecto Final ADA

Consiste en un sistema de gestión de Reservas de Hotel

### Ventana de Inicio

Esta es una sencilla ventana que nos da la bienvenida y nos permite tanto iniciar sesión o registrarnos como un nuevo usuario.

### Ventana de Registro

Ventana la cual permite registrar a un nuevo usuario en la aplicación, también incluye un botón que nos permite cancelar en caso de haber entrado sin querer.

### Ventana de Inicio de Sesión

Ventana que nos permite iniciar sesión con un usuario anteriormente registrado

- Código de ventana
    
    ```kotlin
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
            println("Boton Inicio Sesion")
        }
    
        fun loginbuttonClick() {
            val fxmlLoader = FXMLLoader(HelloApplication::class.java.getResource("homeScreen.fxml"))
            val scene = Scene(fxmlLoader.load(), 320.0, 240.0)
    
            createStage(scene)
        }
    
        fun onBackButtonClick() {
            val fxmlLoader = FXMLLoader(HelloApplication::class.java.getResource("StartScreen.fxml"))
            val scene = Scene(fxmlLoader.load(), 320.0, 240.0)
            createStage(scene)
        }
    
    }
    ```
    

### Ventana Principal
