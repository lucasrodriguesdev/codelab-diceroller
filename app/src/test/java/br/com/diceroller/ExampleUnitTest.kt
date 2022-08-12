package br.com.diceroller

import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {

    @Test
    fun testeNumeroRandomico(){
        val dado = Dado(6)
        val resultado = dado.rolarDados()
        assertTrue("Numero randomico esta fora do range de 1 a 6", resultado in 1..6)
    }
}