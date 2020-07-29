package fx.javafxFactory

import javafx.event.ActionEvent
import javafx.event.EventHandler
import javafx.scene.control.Button
import javafx.scene.input.MouseEvent

object ButtonFactory {
    fun button(text: String = "", eventHandler: EventHandler<ActionEvent> = EventHandler { }): Button {
        return Button(text).apply {
//            prefWidth
//            prefHeight
//            layoutX
//            layoutY
//            setLayoutXY(PairDoubleEnum.w200h200)
//            //
//            onMouseClicked = EventHandler {
//            }
//            //
            onAction = eventHandler
        }
    }

    fun buttonEnum1(text: String = ""): Button {
        return button(text, EventHandler {
            val button = it.source as Button
            println("所点击按钮的文本是${button.text}")
        })
    }
}