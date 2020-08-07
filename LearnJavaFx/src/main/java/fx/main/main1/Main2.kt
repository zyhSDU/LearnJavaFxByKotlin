package fx.main.main1

import fx.javafxFactory.PaneFactory
import fx.javafxFactory.SceneFactory
import fx.javafxFactory.StageFactory
import fx.res.PairDoubleEnum
import javafx.application.Application
import javafx.event.EventHandler
import javafx.scene.control.Button
import javafx.scene.layout.StackPane
import javafx.stage.Stage

/**
 * @program: javafxRoot
 * @description: 场景切换
 * @author: 张宇涵
 * @create: 2020-07-19 22:29
 */
fun main() {
    Application.launch(Main2::class.java)
}
class Main2 : Application() {
    @Throws(Exception::class)
    override fun start(primaryStage: Stage) {
        // 场景1
        val button1 = Button("场景1 的button")
        val vBox = PaneFactory.vBox().apply {
            children.add(button1)
        }
        val scene1 = SceneFactory.scene(vBox, PairDoubleEnum.w400h400)
        // 场景2
        val button2 = Button("场景2 的button")
        val stackPane = StackPane().apply {
            children.add(button2)
        }
        val scene2 = SceneFactory.scene(stackPane, PairDoubleEnum.w400h400)
        //场景切换
        button1.onMouseClicked = EventHandler {
            primaryStage.scene = scene2
        }
        button2.onMouseClicked = EventHandler {
            primaryStage.scene = scene1
        }
        //stage
        StageFactory.stage(primaryStage,scene = scene1).show()
    }
}