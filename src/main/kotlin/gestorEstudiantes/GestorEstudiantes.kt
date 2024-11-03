package org.example.gestorEstudiantes

import org.example.Consola

class GestorEstudiantes(
    val consola: Consola,
    val profesor: Profesor,
    var listaEstudiantes: MutableList<Estudiante> = mutableListOf()
) {

    fun pedirEstudiante() {
        consola.imprimirTexto("Nombre del estudiante: ", false)
        val nombre = consola.pedirString()
        consola.imprimirTexto("Apellido del estudiante: ", false)
        val apellido = consola.pedirString()
        val curso = pedirCurso()
        val estudiante = Estudiante(nombre, apellido)
        profesor.asignarCurso(estudiante, curso)
        listaEstudiantes.add(estudiante)
    }

    private fun pedirCurso(): Curso {
        consola.imprimirTexto("Nombre del curso: ", false)
        val nombre = consola.pedirString()
        consola.imprimirTexto("Nota del curso: ", false)
        val nota = consola.pedirDouble().toDouble()
        return Curso(nombre, nota)
    }

    fun notaMedia() {
        consola.imprimirTexto("Nombre del estudiante: ", false)
        val estudiante = listaEstudiantes.find { it.nombre == readln() }
        if ( estudiante != null ) {
            consola.imprimirTexto("Nota media: ${profesor.calcularNotaMedia(estudiante)}", true)
        }
    }
}