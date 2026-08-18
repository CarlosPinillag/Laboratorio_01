package cl0duoc.dsy1105.lab

class LaboratorioKotlin
fun obtenerEstadoBateria(bateria: Int): String {
    return when {
        bateria < 20 -> "Batería baja"
        bateria in 20..79 -> "Batería suficiente"
        else -> "Batería alta"
    }
}

fun main() {

    val modelo = "Galaxy A55"
    val porcentaje = 18
    val modoAhorro = false
    val propietario: String? = null

    val estado = obtenerEstadoBateria(porcentaje)


    println("TELÉFONO")
    println("Modelo: $modelo")
    println("Batería: $porcentaje%")
    println("Estado: $estado")
    println("Ahorro de energía: $modoAhorro")
    println("Propietario: ${propietario ?: "Sin propietario"}")
}