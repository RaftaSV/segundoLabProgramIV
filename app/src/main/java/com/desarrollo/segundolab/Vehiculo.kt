package com.desarrollo.segundolab

import java.security.Principal

class Vehiculo(marca:String,rin:Int,Marcavehiculo: String,modelo:String,anio:Int,var Puertas: Int, var capacidad: Int ):Marca(marca,rin,Marcavehiculo,modelo,anio),Estado{

    fun Vehiculo(){

        println("El vehiculo ${Marcavehiculo} tiene $Puertas y una capacidad de $capacidad pasajeros")

    }
    override fun marcaVehiculo()
    {
        println("La marca del vehiculo es: $Marcavehiculo, modelo $modelo año de fabricacion $anio")

    }

}