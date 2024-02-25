package com.jluqgon.finalada.Classes

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.Table

@Entity
@Table(name = "Hoteles")
class Hotels(
    @Id @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column(name = "id") val id: Long? = null,
    @Column(name = "Nombre") val hotelName: String = "",
    @Column(name = "Direccion") val adress: String = "",
    @Column(name = "Estrellas") val stars: Int = 0
)
{

}