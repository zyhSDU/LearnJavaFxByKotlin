package fx.main.main1

import fx.javafxFactory.ButtonFactory
import fx.javafxFactory.PaneFactory
import fx.javafxFactory.SceneFactory
import fx.javafxFactory.StageFactory
import fx.res.PairDoubleEnum
import javafx.application.Application
import javafx.event.EventHandler
import javafx.stage.Stage

/**
 * @program: javafxRoot
 * @description: 舞台，场景，布局，控件，点击事件
 * @author: 张宇涵
 * @create: 2020-07-19 21:38
 */
fun main() {
    Application.launch(Main1::class.java)
}

class Main1 : Application() {
    override fun start(primaryStage: Stage) {
        val button = ButtonFactory.button("hello", EventHandler {
            println("点击了按钮hello")//虽然button在场景里，但是点击button时，场景不算被点击到
        })
        val stackPane = PaneFactory.stackPane().apply {
            children.add(button)
        }
        val scene = SceneFactory.scene(stackPane, PairDoubleEnum.w200h200, EventHandler {
            println("你点击了场景")
        })
        //stage
        StageFactory.stage(primaryStage, scene = scene).show()
    }
}