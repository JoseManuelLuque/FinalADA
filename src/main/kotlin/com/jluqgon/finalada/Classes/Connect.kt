package com.jluqgon.finalada.Classes

import java.sql.Connection
import java.sql.DriverManager
import java.sql.SQLException

class Connect {
    fun connectToDatabase(): Connection? {
        try {
            // Paso 1: Cargar el controlador JDBC
            Class.forName("com.mysql.cj.jdbc.Driver")

            // Paso 2: Establecer la conexión
            val url = "jdbc:mysql://localhost:3306/ada"
            val user = "root"
            val password = "Alberti956"

            return DriverManager.getConnection(url, user, password)
        } catch (e: ClassNotFoundException) {
            e.printStackTrace()
            println("Error: No se pudo cargar el controlador JDBC.")
        } catch (e: SQLException) {
            e.printStackTrace()
            println("Error de conexión a la base de datos.")
        }

        return null
    }

}