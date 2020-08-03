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
        val button1 = ButtonFactory.buttonEnum1("b1", this).apply { setLayoutXY(PairDoubleEnum.x0y0) }
        val button2 = ButtonFactory.buttonEnum3("b2").apply { setLayoutXY(PairDoubleEnum.x200y0) }
        val button3 = ButtonFactory.buttonEnum4("b3").apply { setLayoutXY(PairDoubleEnum.x400y0) }

        val group = Group().apply {
            children.clear()
            children.addAll(button1, button2, button3)
//            isAutoSizeChildren=false//???
//            opacity=0.5
//            println(contains(10.0, 10.0))
        }

        primaryStage.scene = SceneFactory.sceneEnum1(group, PairDoubleEnum.w800h800,runnable = Runnable {
            button1.onAction.handle(null)
        }).apply {
            onMouseClicked = EventHandler {
                println(it::class.java)
                println(it)
                println("${it.x}+${it.y}")
            }

        }
        primaryStage.show()
    }
}