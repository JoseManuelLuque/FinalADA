package com.jluqgon.finalada.Classes

import jakarta.persistence.*


@Entity
@Table(name = "Usuarios")
data class User(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id") val id: Long? = null,
    @Column(name = "Nombre") val userName: String = "",
    @Column(name = "Contraseña") val password: String = "",
    @Column(name = "Correo") val email: String = "")
{

}