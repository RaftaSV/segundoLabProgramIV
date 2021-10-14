package com.desarrollo.segundolab

abstract class Marca( marca:String, rin :Int ,var Marcavehiculo: String,var modelo: String, var anio : Int) : Llantas(marca, rin ){

   abstract fun marcaVehiculo()


}