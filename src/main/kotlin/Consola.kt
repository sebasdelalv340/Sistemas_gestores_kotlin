package org.example

import kotlin.contracts.contract

class Consola {

    fun imprimirTexto(mensaje: String, salto: Boolean) {
        if(salto) {
            println(mensaje)
        } else {
            print(mensaje)
        }
    }

    fun pedirString(): String {
        return readln()
    }

    fun pedirEntero(): Int {
        return readln().toInt()
    }

    fun pedirDouble(): Double {
        return readln().toDouble()
    }

    fun preguntarOpcion(): Boolean {
        var opcion = true
        do {
            imprimirTexto("S/N", false)
            if (readln().lowercase() == "s") {
                opcion = false
                return true
            } else if (readln().lowercase() == "n") {
                opcion = false
                return false
            } else {
                imprimirTexto("Valor no válido.", true)
                return false
            }
        } while (opcion)
    }
}