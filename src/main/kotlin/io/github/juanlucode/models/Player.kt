package io.github.juanlucode.models

data class Player(
        val name: String,
        val tPlayer: TPlayer,
        var aceScore: Score,
        var kingScore: Score,
        var queenScore: Score,
        var jackScore: Score,
        var redScore: Score,
        var blackScore: Score
) {

    open var totalPartial: Score = Score(0,0)
        get() {
        var totalScore:Score = Score(0,0)

        totalScore.round1 = aceScore.round1 +
                            kingScore.round1 +
                            queenScore.round1 +
                            jackScore.round1 +
                            redScore.round1 +
                            blackScore.round1

        totalScore.round2 = aceScore.round2 +
                            kingScore.round2 +
                            queenScore.round2 +
                            jackScore.round2 +
                            redScore.round2 +
                            blackScore.round2

        return totalScore
    }

    open var total: Int = 0
        get(){
            return  aceScore.total() +
                    kingScore.total() +
                    queenScore.total() +
                    jackScore.total() +
                    redScore.total() +
                    blackScore.total()
        }
}