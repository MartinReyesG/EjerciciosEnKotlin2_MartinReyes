/*
1) Desarrollar una función que simule una calculadora científica que permita calcular
el seno, coseno, tangente, exponencial y logaritmo neperiano. La función preguntará
al usuario el valor y la función a aplicar, y mostrará por pantalla una tabla con
los enteros de 1 al valor introducido y el resultado de aplicar la función a esos enteros.
 */
import kotlin.math.*

fun main() {

    println("Ingresa la letra de la función que quieras usar" +
            "\nSeno (S)\nCoseno (C)\nTangente (T)\nExponencial (E)\nLogaritmo (L)")
    val operacion = readLine().toString()

    print("Ingresa el valor numérico: ")
    val digito = readLine()!!.toInt()
    println()


    calculadora(operacion, digito)
}

fun calculadora(ope: String, dig: Int) {

    for (i in 1..dig) {
        val v=
            when (ope) {
                "S" -> sin(i.toDouble())
                "C" -> cos(i.toDouble())
                "T" -> tan(i.toDouble())
                "E" -> exp(i.toDouble())
                "L" -> ln(i.toDouble())
                else -> 0.0
            }
        if(v<0){
            println("$i -> $v")
        }else{
            println("$i ->  $v")
        }
    }
}