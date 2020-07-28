package fx.main

import fx.javafxFactory.ButtonFactory
import fx.res.PairDoubleEnum
import fx.javafxFactory.SceneFactory
import fx.javafxFactory.StageFactory
import javafx.application.Application
import javafx.event.EventHandler
import javafx.scene.layout.StackPane
import javafx.stage.Stage

/**
 * @program: javafxRoot
 * @description: 舞台，场景，布局，控件，点击事件
 * @author: 张宇涵
 * @create: 2020-07-19 21:38
 */
class Main1 : Application() {
    override fun start(primaryStage: Stage) {
        val button = ButtonFactory.button("hello", EventHandler {
            println("点击了按钮hello")
        })

        val stackPane = StackPane().apply {
            children.add(button)
        }

        val scene = SceneFactory.scene(stackPane, PairDoubleEnum.w200h200).apply {
            onMouseClicked = EventHandler {
                println("你点击了场景")
            }
        }

        StageFactory.stage(primaryStage, "标题", scene).show()
    }
}