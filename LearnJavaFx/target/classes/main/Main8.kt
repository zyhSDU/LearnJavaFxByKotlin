package fx.main

import fx.javafxFactory.ButtonFactory
import fx.javafxFactory.NodeFactory.setLayoutXY
import fx.javafxFactory.SceneFactory
import fx.res.PairDoubleEnum
import javafx.application.Application
import javafx.event.EventHandler
import javafx.scene.Group
import javafx.scene.text.Font
import javafx.stage.Stage

/**
 * @program: javafxRoot
 * @description:
 * @author: 张宇涵
 * @create: 2020-07-26 12:19
 */
class Main8 : Application() {
    override fun start(primaryStage: Stage) {
        val button1 = ButtonFactory.button("b1").apply { setLayoutXY(PairDoubleEnum.x0y0) }.apply {
            layoutX = 10.0
            layoutY = 10.0
            font = Font.font("sans-serif", 40.0)
//            textFill= Paint.valueOf("#cd0000")
//            background= Background(BackgroundFill(Paint.valueOf("#8fbc8f"), CornerRadii(20.0), Insets(10.0,5.0,20.0,5.0)))
//            border= Border(BorderStroke(Paint.valueOf("#8a2be2"),BorderStrokeStyle.DOTTED, CornerRadii(20.0), BorderWidths(5.0)))
            style = "-fx-background-color:#7ccd7c;-fx-background-radius:20;-fx-text-fill:#5cacee;"
//            hostServices.showDocument("https://docs.oracle.com/javafx/2/api/javafx/scene/doc-files/cssref.html")//打开网页

        }
        val button2 = ButtonFactory.button("b2").apply { setLayoutXY(PairDoubleEnum.x200y0) }
        val button3 = ButtonFactory.button("b3").apply { setLayoutXY(PairDoubleEnum.x400y0) }

        val group = Group().apply {
            children.addAll(button1, button2, button3)
//            isAutoSizeChildren=false//???
//            opacity=0.5
//            println(contains(10.0, 10.0))
        }

        button3.onAction = EventHandler {
            group.children.clear()
        }

        primaryStage.scene = SceneFactory.scene(group, PairDoubleEnum.w800h800).apply {
            onMouseClicked = EventHandler {
                println("${it.x}+${it.y}")
            }
        }
        primaryStage.show()
    }
}