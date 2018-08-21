package io.github.juanlucode.views

import io.github.juanlucode.controllers.BoardController
import io.github.juanlucode.models.Player
import javafx.geometry.Insets
import tornadofx.*

class BoardView : View("Board") {

    val controller = BoardController()

    override val root = anchorpane {
        prefHeight = 622.0
        prefWidth = 810.0
        vbox{
            prefHeight = 622.0
            prefWidth = 810.0
            hbox{
                prefHeight = 423.0
                prefWidth = 810.0
                hboxConstraints {
                    c("#167541", 0.0)
                }
                hbox {
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
            }
            tableview(controller.players) {
                prefHeight = 200.0
                prefWidth = 200.0
                readonlyColumn("Player", Player::name){
                    prefWidth = 227.0
                }

                readonlyColumn("A", Player::aceScore){
                    prefWidth = 80.0
                }
                readonlyColumn("K", Player::kingScore){
                    prefWidth = 80.0
                }
                readonlyColumn("Q", Player::queenScore){
                    prefWidth = 80.0
                }
                readonlyColumn("J", Player::jackScore){
                    prefWidth = 80.0
                }
                readonlyColumn("r", Player::redScore){
                    prefWidth = 80.0
                }
                readonlyColumn("b", Player::blackScore){
                    prefWidth = 80.0
                }
                readonlyColumn("score", Player::total){
                    prefWidth = 80.0
                }
            }
        }
    }
}
