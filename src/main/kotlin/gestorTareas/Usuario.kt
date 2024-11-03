package org.example.gestorTareas

import org.example.Consola

class Usuario(
    val consola: Consola,
    val nombre: String,
    val listaProyecto: MutableList<Proyecto> = mutableListOf()
) {

    fun crearProyecto() {
        consola.imprimirTexto("Introduce el nombre del proyecto: ", false)
        val nombre = consola.pedirString()
        listaProyecto.add(Proyecto(nombre))
    }

    fun asignarTarea() {
        val proyecto = buscarProyecto()
        consola.imprimirTexto("Nombre de la tarea: ", false)
        val nombre = consola.pedirString()
        consola.imprimirTexto("Descripción de la tarea: ", false)
        val descripcion = consola.pedirString()
        val tarea = Tarea(nombre, descripcion)
        proyecto?.listaTarea?.add(tarea)
    }

    private fun buscarProyecto(): Proyecto? {
        consola.imprimirTexto("Nombre del proyecto: ", false)
        val nombre = consola.pedirString()
        return listaProyecto.find { it.nombre == nombre}
    }

    fun cambiarEstadoTarea() {
        val proyecto = buscarProyecto()
        val tarea = buscarTarea(proyecto)
        consola.imprimirTexto("El estado de la tarea es ${tarea?.estado}", true)
        consola.imprimirTexto("¿Desea cambiar el estado?", true)
        if (consola.preguntarOpcion()) {
            if (tarea?.estado == Estado.PENDIENTE) {
                tarea.estado = Estado.COMPLETADA
                consola.imprimirTexto("Estado de la tarea cambiado a completada.", true)
            } else {
                tarea?.estado = Estado.PENDIENTE
                consola.imprimirTexto("Estado de la tarea cambiado a pendiente.", true)
            }
        }
    }

    private fun buscarTarea(proyecto: Proyecto?): Tarea? {
        consola.imprimirTexto("Nombre de la tarea: ", false)
        val nombre = consola.pedirString()
        return proyecto?.listaTarea?.find { it.nombre == nombre}
    }
}