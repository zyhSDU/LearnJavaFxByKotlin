package fx.javafxFactory

import javafx.event.EventHandler
import javafx.scene.control.Button
import javafx.scene.input.MouseEvent

object ButtonFactory {
    fun button(text: String = "", eventHandler: EventHandler<MouseEvent> = EventHandler { }): Button {
        return Button(text).apply {
            onMouseClicked = eventHandler
//            prefWidth
//            prefHeight
//            layoutX
//            layoutY
//            setLayoutXY(PairDoubleEnum.w200h200)
        }
    }
}