class Persona(val nombre: String) 


open class Vehiculo(val marca: String, val modelo: String, val año: Int,var propietario: Persona?=null){
    companion object {
        var contador: Int = 0
    }
  

    init {
        contador++
    }
}


class Coche(marca: String, modelo: String, año: Int, propietario: Persona?=null, val numeroPuertas: Int) 
    : Vehiculo(marca, modelo, año, propietario){
        override fun toString():String{
            return "$marca $modelo del $año con $numeroPuertas puertas, propietario: ${propietario?.nombre ?: "sin propietario"}"
        }
      }

class Camion(marca: String, modelo: String, año: Int, propietario: Persona?, val capacidadCarga: Int) 
    : Vehiculo(marca, modelo, año, propietario){
        override fun toString():String{
           return "$marca $modelo del $año con $capacidadCarga toneladas de capacidad, propietario: ${propietario?.nombre ?: "sin propietario"}"
        }
    }


fun main() {
    
    val juan = Persona("Juan")
    val ana = Persona("Ana")

    
    val coche1 = Coche("Toyota", "Corolla", 2020, juan, 4)
    val coche2 = Coche("Honda", "Civic", 2021, ana, 4)
    val coche3 = Coche("Ford", "Focus", 2022, null, 4)
    val camion1 = Camion("Mercedes", "Actros", 2019, juan, 18)

    
  

    
    println("Total vehiculos creados ${Vehiculo.contador}")
    println(coche1.toString())
    println(coche2.toString())
    println(coche3.toString())
    println(camion1.toString())

}
