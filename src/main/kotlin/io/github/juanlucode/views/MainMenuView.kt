package io.github.juanlucode.views

import io.github.juanlucode.controllers.MainMenuController
import javafx.geometry.Insets
import javafx.geometry.Pos
import javafx.scene.control.Button
import javafx.scene.layout.VBox
import tornadofx.*

class MainMenuView : View("Main Menu") {

    val controller = MainMenuController()

    var infoButton: Button by singleAssign()
    var playButton: Button by singleAssign()
    var exitButton: Button by singleAssign()

    override val root = vbox {
            prefHeight=622.0
            prefWidth=810.0
            alignment = Pos.CENTER
            layoutX = 194.0
            layoutY = 140.0
            //prefHeight = 121.0
            //prefWidth = 212.0
            infoButton = button("INFO"){
                isMnemonicParsing = false
                prefHeight = 26.0
                prefWidth = 148.0
                vboxConstraints {
                    margin = Insets(10.0)
                }


            }
            playButton = button("PLAY"){
                isMnemonicParsing = false
                prefWidth = 148.0
                vboxConstraints {
                    margin = Insets(10.0)
                }
                action {
                    replaceWith(DefinePlayersView::class, ViewTransition.Slide(0.3.seconds, ViewTransition.Direction.LEFT))
                }
            }
            exitButton = button("EXIT"){
                isMnemonicParsing = false
                prefWidth = 148.0
                vboxConstraints {
                    margin = Insets(10.0)
                }

            }
    }
}
