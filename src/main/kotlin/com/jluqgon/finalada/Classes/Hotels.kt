package com.jluqgon.finalada.Classes

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id

@Entity
data class Hotels(
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    val id: Long? = null,
    val hotelName: String = "",
    val adress: String = "",
    val stars: Int = 0
)
{

}