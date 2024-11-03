package juegoRol

import org.example.Consola

/*
Crea un sistema básico para un juego de rol. Define clases para Personaje,
 Guerrero, Mago, y Hechizo. Implementa métodos para atacar y usar hechizos. Los
 personajes deben tener puntos de vida y poder realizar acciones según su clase.
 */

fun main() {
    val consola: Consola = Consola()
    val guerrero: Guerrero = Guerrero("Enno", 6)
    val hechizo: Hechizo = Hechizo("Fuego", 2)
    val hechizero: Hechizero = Hechizero("Gandalf", 5, hechizo)

    do {
        val personaje = if((0..1).random() == 0) guerrero else hechizero
        if(personaje == guerrero) {
            hechizero.recibirDamage(personaje.ataque)
        } else {
            personaje.recibirDamage(hechizero.ataque)
        }
        consola.imprimirTexto(hechizero.toString(), true)
        consola.imprimirTexto(guerrero.toString(), true)
    } while (guerrero.vida > 0 && hechizero.vida > 0)

    if(guerrero.vida <= 0) {
        consola.imprimirTexto("${hechizero.nombre} ha ganado.", true)
    } else {
        consola.imprimirTexto("${guerrero.nombre} ha ganado.", true)
    }

}