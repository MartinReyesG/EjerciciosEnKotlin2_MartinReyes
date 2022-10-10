/*
3) Escribir una función reciba una lista de calificaciones y devuelva la lista de calificaciones
correspondientes a esas notas.
95-100(excelente), 85-94(Notable), 75-84(Bueno), 70-74(Suficiente)  <70(Desempeño insuficiente).
 */

fun main(){
    var listaDeCalificaciones = listOf<Int>(97,100,92,95,80,60,42,71,69)
    println(calcularCalificacion(listaDeCalificaciones))
}

fun calcularCalificacion(list: List<Int>): MutableList<String> {
    var a= mutableListOf<String>()
    for (i in list){
        if(i <=100 && i >=95){
            a.add("$i Excelente\n")
        }else if(i <=94 && i >=85){
            a.add("$i Notable\n")
        }else if(i <=84 && i >=75){
            a.add("$i Bueno\n")
        }else if(i <=74 && i >=70){
            a.add("$i Suficiente\n")
        }else if (i < 70){
            a.add("$i Desempeño insuficiente\n")
        }
    }
    return a
}

