package org.example.gestorBiblioteca

enum class Estado {
    PRESTADO,
    DISPONIBLE
}

data class Libro(
    val titulo: String,
    val autor: String,
    val genero: String,
    var estado: Estado = Estado.DISPONIBLE
) {
}