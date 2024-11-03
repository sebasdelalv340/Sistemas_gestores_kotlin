package org.example.gestorEstudiantes

import org.example.Consola
import org.example.reservasHotel.GestorReservar

/*
 Implementa un sistema para gestionar estudiantes en una escuela. Define clases
 para Estudiante, Curso, y Profesor. Permite a los profesores asignar cursos a los
 estudiantes y calcular la calificación promedio de cada estudiante.
 */

fun main() {
    val consola: Consola = Consola()
    val profesor: Profesor = Profesor("Luis", "Gónzalez", "Programación multimedia")
    val gestorEstudiantes: GestorEstudiantes = GestorEstudiantes(consola, profesor)

    while (true) {
        println("Menú:")
        println("1. Asignar curso.")
        println("2. Calcular nota media.")
        println("3. Salir")
        println("Elige una opción (1-3):")

        when (readLine()?.toIntOrNull()) {
            1 -> gestorEstudiantes.pedirEstudiante()
            2 -> gestorEstudiantes.notaMedia()
            3 -> {
                println("Saliendo del menú. ¡Hasta luego!")
                Thread.sleep(3000)
                break
            }
            else -> println("Opción no válida. Inténtalo de nuevo.")
        }
    }

}