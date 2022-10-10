import java.math.RoundingMode
import java.text.DecimalFormat

/*
2) Desarrollar una función que reciba otra función booleana y una lista,
y devuelva otra lista con los elementos de la lista que devuelvan True
al aplicarles la función booleana.
 */

fun main() {

    val edades = listOf(18, 17, 19, 86, 84, 18,20,21,22,56,48,4,9,10,26,7)
    println((calcularMayoriaDeEdad(edades) { a -> validarEdad(a) }))
}

fun validarEdad(edad: Int): Boolean {
  if(edad>=18){
      return true
  }else{
     return false
  }
}


fun calcularMayoriaDeEdad(edades: List<Int>, calcular: (Int) -> Boolean): MutableList<String> {

    val l = mutableListOf<String>()
    for (i in edades) {
        if(calcular(i)){
            l.add("$i: es mayor de edad\n")
        }else{
            l.add("$i: es menor de edad\n")
        }
    }
    return l
}

