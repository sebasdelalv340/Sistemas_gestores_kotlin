package org.example.gestorTareas

import java.time.LocalDate

enum class Estado {
    PENDIENTE, COMPLETADA
}

data class Tarea(
    val nombre: String,
    val descripcion: String,
    val fecha: LocalDate = LocalDate.now(),
    var estado: Estado = Estado.PENDIENTE
) {
}