package io.github.juanlucode.models

data class Game(val player1: Player, val player2: Player) {

    private val scoreFree = arrayOf(0,0,0,0,0,0)
    private val scoreRequired = arrayOf(0,0,0,0,0,0)
    private val score = arrayOf(scoreFree, scoreRequired)

    fun start(){

    }
}