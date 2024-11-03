package org.example.reservasHotel

import org.example.Consola

/*
Diseña un sistema para gestionar reservas de un hotel. Implementa clases para
 Habitación, Cliente, y Reserva. Permite a los clientes reservar habitaciones y
 cancelar reservas. Incluye un método que muestre todas las reservas activas.
 */

fun main() {
    val consola: Consola = Consola()
    val gestorReservar: GestorReservar = GestorReservar(consola)

    while (true) {
        consola.imprimirTexto("Menú:", true)
        consola.imprimirTexto("1. Realizar reserva.", true)
        consola.imprimirTexto("2. Cancelar reserva.", true)
        consola.imprimirTexto("3. Mostrar reservas.", true)
        consola.imprimirTexto("4. Salir", true)
        consola.imprimirTexto("Elige una opción (1-4):", true)

        when (readLine()?.toIntOrNull()) {
            1 -> gestorReservar.realizarReserva()
            2 -> gestorReservar.cancelarReserva()
            3 -> gestorReservar.mostrarReservas()
            4 -> {
                consola.imprimirTexto("Saliendo del menú. ¡Hasta luego!", true)
                Thread.sleep(3000)
                break
            }
            else -> consola.imprimirTexto("Opción no válida. Inténtalo de nuevo.", true)
        }
    }
}