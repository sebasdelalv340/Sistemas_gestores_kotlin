package org.example.reservasHotel

import org.example.Consola

class GestorReservar(
    val consola: Consola,
    val reservas: MutableList<Reserva> = mutableListOf<Reserva>()
) {
    fun realizarReserva() {
        val cliente = infoCliente()
        val numHabitacion = (101..520).random()
        val tipo = if((0..1).random() == 0) Tipo.INDIVIDUAL else Tipo.DOBLE
        reservas.add(Reserva(cliente, Habitacion(numHabitacion, tipo)))
    }

    fun cancelarReserva() {
        val cliente = infoCliente()
        val reserva = reservas.find { it.cliente == cliente }
        if (reserva != null) {
            reservas.remove(reserva)
            consola.imprimirTexto("Reserva cancelada.", true)
        } else {
            consola.imprimirTexto("No se ha encontrado ninguna reserva con dicho cliente.", true)
        }
    }

    fun mostrarReservas() {
        reservas.forEach { consola.imprimirTexto(it.toString(), true) }
    }

    private fun infoCliente(): Cliente {
        consola.imprimirTexto("Nombre del cliente: ", false)
        val nombre = consola.pedirString()
        consola.imprimirTexto("DNI del cliente: ", false)
        val dni = consola.pedirString()
        return Cliente(nombre, dni)
    }
}