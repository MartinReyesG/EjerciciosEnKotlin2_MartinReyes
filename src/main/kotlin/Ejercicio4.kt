/*
4) Escribir una función reciba un diccionario con las asignaturas y las notas de un alumno y
devuelva otro diccionario con las asignaturas en mayúsculas y las calificaciones
 correspondientes a las notas aprobadas.
 95-100(excelente), 85-94(Notable), 75-84(Bueno), 70-74(Suficiente)  <70(Desempeño insuficiente).
 */

fun main() {
    val kardex: Map<String, Int> = mapOf(
        "matematicas" to 50, "geografia" to 73, "español" to 80, "quimica" to 93, "historia" to 99
    )
    println(calif(kardex))

}

fun calif(notas: Map<String, Int>): Map<String, String> {
    val des: MutableMap<String, String> = mutableMapOf()
    for ((k, v) in notas) {
        val d = when (v) {
            in 0..69 -> "Desempeño insuficiente"
            in 70..74 -> "Suficiente"
            in 75..84 -> "Bueno"
            in 85..94 -> "Notable"
            in 95..100 -> "Excelente"
            else -> " "
        }
        des[k.uppercase()] = d
    }
    return des
}