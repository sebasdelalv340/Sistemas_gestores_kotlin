package juegoRol

abstract class Personaje(
    val nombre: String,
    var ataque: Int,
    var vida: Int = 100
) {
    open fun atacar(): Int {
        ataque += (1..10).random()
       return ataque
    }

    fun recibirDamage(damage: Int) {
        vida -= damage
        if (vida <= 0) {
            vida = 0
        }
    }
}