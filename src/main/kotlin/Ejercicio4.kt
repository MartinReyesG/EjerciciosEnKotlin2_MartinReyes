/*
4) Escribir una función reciba un diccionario con las asignaturas y las notas de un alumno y
devuelva otro diccionario con las asignaturas en mayúsculas y las calificaciones
 correspondientes a las notas aprobadas.
 95-100(excelente), 85-94(Notable), 75-84(Bueno), 70-74(Suficiente)  <70(Desempeño insuficiente).
 */

fun main() {
    val calificaciones: Map<String, Int> = mapOf(
        "fisica" to 70, "filosofia" to 86, "psicologia" to 47, "historia" to 100, "algebra" to 71, "biologia" to 95
    )
    println(calcularNota(calificaciones))

}

fun calcularNota(notas: Map<String, Int>): Map<String, String> {
    val listaConMaterias: MutableMap<String, String> = mutableMapOf()
    for ((mat, cal) in notas) {
        val notaFinal = when (cal) {
            in 0..69 -> "Desempeño insuficiente\n"
            in 70..74 -> "Suficiente\n"
            in 75..84 -> "Bueno\n"
            in 85..94 -> "Notable\n"
            in 95..100 -> "Excelente\n"
            else -> " "
        }
        listaConMaterias[mat.uppercase()] = notaFinal
    }
    return listaConMaterias
}