package juegoRol

class Hechizero(
    nombre: String,
    ataque: Int,
    val hechizo: Hechizo
): Personaje(nombre, ataque)
{
    override fun atacar(): Int {
        ataque += hechizo.damage
        return ataque
    }
}