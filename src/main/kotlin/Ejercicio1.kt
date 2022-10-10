/*
1) Desarrollar una función que simule una calculadora científica que permita calcular
el seno, coseno, tangente, exponencial y logaritmo neperiano. La función preguntará
al usuario el valor y la función a aplicar, y mostrará por pantalla una tabla con
los enteros de 1 al valor introducido y el resultado de aplicar la función a esos enteros.
 */
import kotlin.math.*

fun main() {

    print("Ingresa el valor numérico: ")
    val n = readLine()!!.toInt()
    println()
    println("Ingresa la función a aplicar\nSeno (s)\nCoseno (c)\nTangente (t)\nExponencial (e)\nLogaritmo (l)")
    val o = readLine().toString()

    calculator(o, n)


}

fun calculator(ope: String, value: Int) {

    for (i in 1..value) {
        val v=
            when (ope) {
                "s" -> sin(i.toDouble())
                "c" -> cos(i.toDouble())
                "t" -> tan(i.toDouble())
                "e" -> exp(i.toDouble())
                "l" -> ln(i.toDouble())
                else -> 0.0
            }
        if(v<0){
            println("$i -> $v")
        }else{
            println("$i ->  $v")
        }
    }
}