package com.example.nuevaclase27feb

import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
        assertEquals(4, 2 + 2)
    }

    @Test
    fun isValidarNombre(){
        var validar = ValidarNombre()
        assertTrue(validar.esValido("pepito"))
    }

    @Test
    fun isValidarNombreFalse(){
        var validar = ValidarNombre()
        assertFalse(validar.esValido("pepitoss"))
    }

}