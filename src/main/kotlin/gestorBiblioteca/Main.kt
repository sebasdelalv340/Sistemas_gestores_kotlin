package org.example.gestorBiblioteca

import org.example.Consola

/*
Crea un sistema de gestión de una biblioteca. Define clases para Libro, Usuario, y
Biblioteca. Implementa métodos para agregar libros, registrar usuarios y prestar
libros a los usuarios. Asegúrate de que un libro no se pueda prestar si ya está
prestado.
 */

fun main() {
    val consola: Consola = Consola()
    val gestorBiblioteca: Biblioteca = Biblioteca(consola)

    while (true) {
        consola.imprimirTexto("Menú:", true)
        consola.imprimirTexto("1. Registrar libro", true)
        consola.imprimirTexto("2. Registrar usuario", true)
        consola.imprimirTexto("3. Prestar libro", true)
        consola.imprimirTexto("4. Salir", true)
        consola.imprimirTexto("Elige una opción (1-4):", true)

        when (readLine()?.toIntOrNull()) {
            1 -> gestorBiblioteca.registrarLibro()
            2 -> gestorBiblioteca.registrarUsuario()
            3 -> gestorBiblioteca.prestarLibro()
            4 -> {
                consola.imprimirTexto("Saliendo del menú. ¡Hasta luego!", true)
                Thread.sleep(3000)
                break
            }
            else -> consola.imprimirTexto("Opción no válida. Inténtalo de nuevo.", true)
        }
    }

}