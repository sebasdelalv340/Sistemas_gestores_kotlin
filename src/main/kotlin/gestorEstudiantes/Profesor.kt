package org.example.gestorEstudiantes

class Profesor(
    val nombre: String,
    val apellido: String,
    val especialidad: String
) {
    fun asignarCurso(estudiante: Estudiante, curso: Curso) {
        estudiante.listaCursos.add(curso)
    }

    fun calcularNotaMedia(estudiante: Estudiante): Double {
        var notaMedia = 0.0
        estudiante.listaCursos.forEach {
            notaMedia += it.nota
        }
        return notaMedia/estudiante.listaCursos.count()
    }
}