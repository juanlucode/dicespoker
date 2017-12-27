package io.github.juanlucode.views

import io.github.juanlucode.styles.Styles
import javafx.geometry.Pos
import javafx.scene.control.Button
import javafx.scene.control.Label
import javafx.scene.layout.VBox
import tornadofx.*

class Intro: View() {

    override val root : VBox by fxml()
    val titleLabel: Label by fxml()
    val authorLabel: Label by fxml()
    val goButton: Button by fxml()

    init {
        root.addClass(Styles.introClass)
        root.children.addClass(Styles.introClass)
    }

}