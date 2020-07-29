package fx.javafxFactory

import fx.javafxFactory.NodeFactory.setLayoutXY
import fx.res.PairDoubleEnum
import javafx.application.Application
import javafx.event.ActionEvent
import javafx.event.EventHandler
import javafx.geometry.Insets
import javafx.scene.control.Button
import javafx.scene.input.MouseEvent
import javafx.scene.layout.*
import javafx.scene.paint.Paint
import javafx.scene.text.Font

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

    fun buttonEnum1(text: String = "", application: Application? = null): Button {
        return button(text).apply {
            setLayoutXY(PairDoubleEnum.x0y0)
            layoutX = 10.0
            layoutY = 10.0
            font = Font.font("sans-serif", 40.0)
//            textFill= Paint.valueOf("#cd0000")
//            background= Background(BackgroundFill(Paint.valueOf("#8fbc8f"), CornerRadii(20.0), Insets(10.0,5.0,20.0,5.0)))
//            border= Border(BorderStroke(Paint.valueOf("#8a2be2"),BorderStrokeStyle.DOTTED, CornerRadii(20.0), BorderWidths(5.0)))
            style = "-fx-background-color:#7ccd7c;" +
                    "-fx-background-radius:20;" +
                    "-fx-text-fill:#5cacee;"
            application?.apply {
                onAction = EventHandler {
                    hostServices.showDocument("https://docs.oracle.com/javafx/2/api/javafx/scene/doc-files/cssref.html")//打开网页
                }
            }
        }
    }

    fun buttonEnum2(text: String = ""): Button {
        return button(text, EventHandler {
            val button = it.source as Button
            println("所点击按钮的文本是${button.text}")
        })
    }
}