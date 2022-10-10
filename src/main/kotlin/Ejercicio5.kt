/*
5) Una inmobiliaria de una ciudad maneja una lista de inmuebles como la siguiente:

[{'año': 2000, 'metros': 100, 'habitaciones': 3, 'garaje': True, 'zona': 'A'},
{'año': 2012, 'metros': 60, 'habitaciones': 2, 'garaje': True, 'zona': 'B'},
{'año': 1980, 'metros': 120, 'habitaciones': 4, 'garaje': False, 'zona': 'A'},
{'año': 2005, 'metros': 75, 'habitaciones': 3, 'garaje': True, 'zona': 'B'},
{'año': 2015, 'metros': 90, 'habitaciones': 2, 'garaje': False, 'zona': 'A'}]

Construir una función que permita hacer búsqueda de inmuebles en función de un presupuesto dado.
La función recibirá como entrada la lista de inmuebles y un precio, y devolverá otra lista con
los inmuebles cuyo precio sea menor o igual que el dado.
Los inmuebles de la lista que se devuelva deben incorporar un nuevo par a cada diccionario con el precio
del inmueble, donde el precio de un inmueble se calcula con las siguiente fórmula en función de la zona:

Zona A: precio = (metros * 1000 + habitaciones * 5000 + garaje * 15000) * (1-antiguedad/100)
Zona B: precio = (metros * 1000 + habitaciones * 5000 + garaje * 15000) * (1-antiguedad/100) * 1.5
 */
fun main() {
    val houses = listOf(
        House(2000, 100, 3, true, 'A'),
        House(2011, 60, 2, true, 'B'),
        House(1980, 120, 4, false, 'A'),
        House(2005, 75, 3, true, 'B'),
        House(2015, 90, 2, false, 'A')
    )

    println(price(houses, 250000000.0))
}

class House(var y: Int, var m: Int, var h: Int, var g: Boolean, var z: Char)

fun price(houses: List<House>, price: Double): List<Pair<String, Double>> {
    val priceHouses: MutableList<Pair<String, Double>> = mutableListOf()
    var p = 0.0
    for (i in houses.indices) {
        if (houses[i].z == 'A') {
            p = if (houses[i].g) {
                ((houses[i].m * 1000 + houses[i].h * 5000 + 15000) * (2022 - houses[i].y / 100)).toDouble()
            } else {
                ((houses[i].m * 1000 + houses[i].h * 5000) * (2022 - houses[i].y / 100)).toDouble()
            }
        } else if (houses[i].z == 'B') {
            p = if (houses[i].g) {
                (houses[i].m * 1000 + houses[i].h * 5000 + 15000) * (2022 - houses[i].y / 100) * 1.5
            } else {
                (houses[i].m * 1000 + houses[i].h * 5000) * (2022 - houses[i].y / 100) * 1.5
            }
        }
        if (p <= price) {
            val cad= "Habitaciones: "+houses[i].h.toString()+", "+"Año: "+houses[i].y.toString()+", "+"Garage: "+houses[i].g.toString()+", "+"Zona: "+houses[i].z.toString()+", "+"Metros: "+houses[i].m.toString()
            priceHouses.add(Pair(cad, p))
        }
    }
    return priceHouses
}