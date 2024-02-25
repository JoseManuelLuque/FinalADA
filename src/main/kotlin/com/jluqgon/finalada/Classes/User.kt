package com.jluqgon.finalada.Classes

import jakarta.persistence.*
import java.io.Serializable

@Entity
@Table(name = "usuarios")
class User : Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private var id: Int? = null

    @Column(name = "Nombre")
    private var name: String? = null

    @Column(name = "Correo")
    private var email: String? = null

    @Column(name = "Contraseña")
    private var password: String? = null

    fun getId(): Int? {
        return id
    }

    fun setId(id: Int?) {
        this.id = id
    }

    fun getName(): String? {
        return name
    }

    fun setName(name: String?) {
        this.name = name
    }

    fun getEmail(): String? {
        return email
    }

    fun setEmail(email: String?) {
        this.email = email
    }

    fun getPassword(): String? {
        return password
    }

    fun setPassword(password: String?) {
        this.password = password
    }
}
