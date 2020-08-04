package fx.main.main1

import fx.javafxFactory.DialogFactory
import fx.res.PairDoubleEnum
import fx.javafxFactory.SceneFactory
import javafx.application.Application
import javafx.event.EventHandler
import javafx.scene.control.Button
import javafx.scene.layout.StackPane
import javafx.stage.Stage

/**
 * @program: javafxRoot
 * @description: 舞台，场景，布局，控件，点击事件
 * @author: 张宇涵
 * @create: 2020-07-19 21:38
 */
class Main3 : Application() {
    override fun start(primaryStage: Stage) {
        val button = Button("关闭窗口").apply {
            onMouseClicked= EventHandler {
                closeFunction(primaryStage)
            }
        }

        val stackPane = StackPane().apply {
            children.add(button)
        }

        val scene = SceneFactory.scene(stackPane, PairDoubleEnum.w400h400).apply {
            onMouseClicked = EventHandler {
                println("你点击了场景")
            }
        }

        primaryStage.run {
            this.scene = scene
            onCloseRequest= EventHandler {
                it.consume()//取消原有事件
                closeFunction(this)
            }
            show()
        }
    }

    private fun closeFunction(primaryStage: Stage) {
        val b = DialogFactory.booleanDialog(primaryStage)
        if (b) {
            primaryStage.close()
        } else {
            println("no")
        }
    }
}