package io.github.juanlucode.styles

import javafx.scene.text.FontWeight
import tornadofx.*

class Styles : Stylesheet() {
    init {
        label {
            fontSize = 20.px
            fontWeight = FontWeight.BOLD
            backgroundColor += c("#cecece")
        }
    }
}
