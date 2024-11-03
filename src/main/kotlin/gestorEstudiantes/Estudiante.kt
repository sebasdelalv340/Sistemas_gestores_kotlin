package org.example.gestorEstudiantes

data class Estudiante(
    val nombre: String,
    val apellido: String,
    val listaCursos: MutableList<Curso> = mutableListOf(),
) {
}