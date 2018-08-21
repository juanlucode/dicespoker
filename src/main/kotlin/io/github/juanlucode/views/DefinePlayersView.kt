package io.github.juanlucode.views

import io.github.juanlucode.controllers.DefinePlayersController
import io.github.juanlucode.models.TPlayer
import javafx.geometry.Pos
import javafx.scene.control.Button
import javafx.scene.control.ComboBox
import javafx.scene.control.TextField
import tornadofx.*
import javax.xml.soap.Text

class DefinePlayersView : View("DEFINE PLAYERS") {

    val controller = DefinePlayersController()

    var tplayer1ComboBox: ComboBox<TPlayer> by singleAssign()
    var namePlayer1TextField: TextField by singleAssign()
    var tplayer2ComboBox: ComboBox<TPlayer> by singleAssign()
    var namePlayer2TextField: TextField by singleAssign()
    var startButton: Button by singleAssign()

    override val root = vbox {
        prefHeight = 622.0
        prefWidth = 810.0
        label("Define players")
        hbox{
            alignment = Pos.CENTER
            label("Player 1")
            tplayer1ComboBox = combobox<TPlayer> {
                prefWidth = 150.0
                setOnAction {
                    changePlayer(this)
                }
            }
            namePlayer1TextField = textfield()
        }
        hbox{
            alignment = Pos.CENTER
            label("Player 2")
            tplayer2ComboBox = combobox<TPlayer>{
                prefWidth = 150.0
                setOnAction {
                    changePlayer(this)
                }
            }
            namePlayer2TextField = textfield()
        }
        startButton = button("START"){
            isMnemonicParsing = false
            action {
                replaceWith(BoardView::class, ViewTransition.Slide(0.3.seconds, ViewTransition.Direction.LEFT))
            }
        }
    }

    init {
        tplayer1ComboBox.items.addAll(TPlayer.values())
        tplayer2ComboBox.items.addAll(TPlayer.values())
    }

    private fun changePlayer(cbo: ComboBox<TPlayer>){
        var txtField: TextField? = when(cbo){
            tplayer1ComboBox -> namePlayer1TextField

            tplayer2ComboBox -> namePlayer2TextField

            else -> null
        }

        if (cbo.value == TPlayer.COMPUTER){
            txtField?.isEditable = false
            txtField?.text = TPlayer.COMPUTER.toString()
        } else {
            txtField?.isEditable = true
            txtField?.text = ""
        }
    }
}
