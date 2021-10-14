 package com.desarrollo.segundolab

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        vehiculo()
    }
    fun vehiculo(){

//La clase marca hereda la clase llantas
// la clase Vehiculo hereda la clase marca y la interfaz estado
        var vehiculo = Vehiculo("Dunlop",17,"toyota","Corolla",2019,4,5)
        vehiculo.marcaVehiculo()
        vehiculo.Vehiculo()
        vehiculo.encenderApagar()
        vehiculo.encenderApagar()

    }
}