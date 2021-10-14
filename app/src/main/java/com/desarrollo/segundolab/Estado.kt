package com.desarrollo.segundolab
var contador =0
interface Estado {

// esta funcion sera privada por lo cual solo se puede utilizar dentro de esta interfaz
    private fun  estado(){

        if (contador == 0 ){
            println("Encendiendo el vehiculo")
            contador = 1
        }else{

            println("Apagando el vehiculo")
            contador=0
        }


    }

    fun encenderApagar(){

        estado()
    }

}