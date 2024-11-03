package org.example.reservasHotel

enum class Tipo{
    INDIVIDUAL,
    DOBLE
}

data class Habitacion(
    val numero: Int,
    val tipo: Tipo
) {
}