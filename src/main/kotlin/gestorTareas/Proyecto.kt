package org.example.gestorTareas

data class Proyecto(
    val nombre: String,
    val listaTarea: MutableList<Tarea> = mutableListOf()
) {
}