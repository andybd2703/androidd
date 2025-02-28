package com.example.nuevaclase27feb

class ValidarNombre {

    fun esValido(nombre: String): Boolean{

        var estado = false
        if(nombre == "pepito"){
            estado = true
        }
        return estado
    }
}