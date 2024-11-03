package org.example.gestorTareas

import org.example.Consola

/*
 Diseña un gestor de tareas. Crea clases para Tarea, Proyecto, y Usuario. Permite a
 los usuarios crear proyectos, añadir tareas y marcar tareas como completadas
 */

fun main() {
    val consola = Consola()
    val usuario: Usuario = Usuario(consola, "Sebas")


    while (true) {
        consola.imprimirTexto("Menú:", true)
        consola.imprimirTexto("1. Crear proyecto.", true)
        consola.imprimirTexto("2. Asignar tarea.", true)
        consola.imprimirTexto("3. Marcar tarea.", true)
        consola.imprimirTexto("4. Salir", true)
        consola.imprimirTexto("Elige una opción (1-4):", true)

        when (readLine()?.toIntOrNull()) {
            1 -> usuario.crearProyecto()
            2 -> usuario.asignarTarea()
            3 -> usuario.cambiarEstadoTarea()
            4 -> {
                consola.imprimirTexto("Saliendo del menú. ¡Hasta luego!", true)
                Thread.sleep(3000)
                break
            }
            else -> consola.imprimirTexto("Opción no válida. Inténtalo de nuevo.", true)
        }
    }
}