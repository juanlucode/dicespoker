package io.github.juanlucode.views

import tornadofx.*

class Intro: View() {

    override val root = vbox {
        label("Dados de Póker")
        hbox{
            imageview{
                id = "dado1ImageView"
            }
            imageview{
                id = "dado2ImageView"
            }
            imageview{
                id = "dado3ImageView"
            }
            imageview{
                id = "dado4ImageView"
            }
            imageview{
                id = "dado5ImageView"
            }
        }
    }
}