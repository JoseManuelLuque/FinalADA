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
    @Column(name = "id") var id: Long? = null,
    @Column(name = "Nombre") var hotelName: String = "",
    @Column(name = "Direccion") var adress: String = "",
    @Column(name = "Estrellas") var stars: Int = 0
)
{

}