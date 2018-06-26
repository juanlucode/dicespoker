package io.github.juanlucode.controllers

import io.github.juanlucode.models.Player
import io.github.juanlucode.models.Score
import io.github.juanlucode.models.TPlayer
import tornadofx.*

class BoardController {
    val players = listOf(
            Player("Player 1",
                    TPlayer.HUMAN,
                    Score(0,0),
                    Score(0,0),
                    Score(0,0),
                    Score(0,0),
                    Score(0,0),
                    Score(0,0)
            ),
            Player("Player 2",
                    TPlayer.COMPUTER,
                    Score(0,0),
                    Score(0,0),
                    Score(0,0),
                    Score(0,0),
                    Score(0,0),
                    Score(0,0)
            )
    ).observable()
}