package org.example.gestorBiblioteca

import org.example.Consola

class Biblioteca(
    val consola: Consola,
    var listaLibros: MutableList<Libro> = mutableListOf(),
    var listaUsuarios: MutableList<Usuario> = mutableListOf()
) {

    fun registrarLibro() {
        consola.imprimirTexto("Introduzca el título: ", false)
        val titulo = consola.pedirString()
        consola.imprimirTexto("Introduzca el autor: ", false)
        val autor = consola.pedirString()
        consola.imprimirTexto("Introduzca el genero: ", false)
        val genero = consola.pedirString()
        listaLibros.add(Libro(titulo, autor, genero))
    }

    fun registrarUsuario() {
        consola.imprimirTexto("Introduzca su nombre: ", false)
        val nombre = consola.pedirString()
        consola.imprimirTexto("Introduzca su DNI: ", false)
        val dni = consola.pedirString()
        listaUsuarios.add(Usuario(nombre, dni))
    }

    fun prestarLibro() {
        consola.imprimirTexto("Introduzca el título del libro: ", false)
        val titulo = consola.pedirString()
        val libro = listaLibros.find { it.titulo == titulo }
        if(libro?.estado == Estado.DISPONIBLE) {
            consola.imprimirTexto("El libro está disponible.", true)
            libro.estado = Estado.PRESTADO
        } else {
            consola.imprimirTexto("El libro no está disponible.", true)
        }
    }
}