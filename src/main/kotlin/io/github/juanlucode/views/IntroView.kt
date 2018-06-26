package io.github.juanlucode.views

import tornadofx.*
import io.github.juanlucode.styles.Styles
import javafx.geometry.Pos
import io.github.juanlucode.controllers.IntroController
import javafx.geometry.Insets

class IntroView: View() {

    val controller = IntroController()

    override val root = vbox {
        prefHeight=622.0
        prefWidth=810.0

        label("POKER DICES")

        hbox{
            alignment = Pos.CENTER
            imageview{
                id = "dado1ImageView"
                image = resources.image("poker1.png")
                hboxConstraints {
                    margin = Insets(10.0)
                }
            }
            imageview{
                id = "dado2ImageView"
                image = resources.image("poker2.png")
                hboxConstraints {
                    margin = Insets(10.0)
                }
            }
            imageview{
                id = "dado3ImageView"
                image = resources.image("poker3.png")
                hboxConstraints {
                    margin = Insets(10.0)
                }
            }
            imageview{
                id = "dado4ImageView"
                image = resources.image("poker4.png")
                hboxConstraints {
                    margin = Insets(10.0)
                }
            }
            imageview{
                id = "dado5ImageView"
                image = resources.image("poker5.png")
                hboxConstraints {
                    margin = Insets(10.0)
                }
            }
        }

        label("@juanlucode")

        hbox{
            alignment = Pos.CENTER
            imageview{
                id = "dado6ImageView"
                image = resources.image("poker6.png")
                hboxConstraints {
                    margin = Insets(10.0)
                }
            }
            imageview{
                id = "dado7ImageView"
                image = resources.image("poker6.png")
                hboxConstraints {
                    margin = Insets(10.0)
                }
            }
            imageview{
                id = "dado8ImageView"
                image = resources.image("poker6.png")
                hboxConstraints {
                    margin = Insets(10.0)
                }
            }
            imageview{
                id = "dado9ImageView"
                image = resources.image("poker6.png")
                hboxConstraints {
                    margin = Insets(10.0)
                }
            }
            imageview{
                id = "dado10ImageView"
                image = resources.image("poker6.png")
                hboxConstraints {
                    margin = Insets(10.0)
                }
            }
        }

        button("Go!"){
            id = "goButton"
            hboxConstraints {
                margin = Insets(10.0)
            }
            action {
                //controller.goButton_click()
                replaceWith(MainMenuView::class, ViewTransition.Slide(0.3.seconds, ViewTransition.Direction.LEFT))
            }
        }

    }

    init {
        root.addClass(Styles.introClass)
        root.children.addClass(Styles.introClass)
    }
}