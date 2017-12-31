package io.github.juanlucode.styles

import javafx.geometry.Pos
import javafx.scene.text.FontWeight
import tornadofx.*


class Styles : Stylesheet() {

    companion object {
        val introClass by cssclass()
    }

    init {

        introClass {
            backgroundColor += c("green")
        }

        label {
            fontSize = 20.px
            fontWeight = FontWeight.BOLD

        }

        root {

            alignment = Pos.CENTER
        }

        button {
            backgroundColor += c("red")
        }
    }
}
