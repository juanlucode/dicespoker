package io.github.juanlucode

import io.github.juanlucode.styles.Styles
import io.github.juanlucode.views.IntroView
import tornadofx.*

class DicesPokerApp: App(IntroView::class, Styles::class){
    init {
        reloadStylesheetsOnFocus()
    }
}