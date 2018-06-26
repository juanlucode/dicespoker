package io.github.juanlucode.models

data class Score (var round1: Int, var round2: Int){
    fun total() = round1 + round2

    override fun toString() = "${round1} / ${round2}"

}