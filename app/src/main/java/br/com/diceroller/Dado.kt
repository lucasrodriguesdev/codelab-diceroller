package br.com.diceroller

class Dado(private val lados: Int) {

    fun rolarDados() = (1..lados).random()
}