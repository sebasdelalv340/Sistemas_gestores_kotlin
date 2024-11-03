package org.example.gestorBiblioteca

data class Usuario(
    val nombre: String,
    val dni: String,
    var numUsuario: Int = generarNumUsuario()
) {
    companion object {
        private var num = 0
        private fun generarNumUsuario(): Int {
            num += 1
            return num
        }
    }
}