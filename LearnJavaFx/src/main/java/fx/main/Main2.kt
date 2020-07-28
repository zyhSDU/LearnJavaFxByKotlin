package fx.main

import javafx.application.Application
import javafx.event.EventHandler
import javafx.scene.Scene
import javafx.scene.control.Button
import javafx.scene.layout.StackPane
import javafx.scene.layout.VBox
import javafx.stage.Stage
import kotlin.jvm.Throws

/**
 * @program: javafxRoot
 * @description: 场景切换
 * @author: 张宇涵
 * @create: 2020-07-19 22:29
 */
class Main2 : Application() {
    @Throws(Exception::class)
    override fun start(primaryStage: Stage) {
        // 场景1
        val button1 = Button("场景1 的button")
        val vBox = VBox().apply {
            children.add(button1)
        }
        val scene1 = Scene(vBox, 400.0, 400.0)


        val button2 = Button("场景2 的button")
        val stackPane = StackPane().apply {
            children.add(button2)
        }
        val scene2 = Scene(stackPane, 400.0, 400.0)

        button1.onMouseClicked = EventHandler {
            primaryStage.scene = scene2
        }
        button2.onMouseClicked = EventHandler {
            primaryStage.scene = scene1
        }

        primaryStage.run {
            scene = scene1
            show()
        }
    }
}