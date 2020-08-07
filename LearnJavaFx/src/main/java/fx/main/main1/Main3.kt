package fx.main.main1

import fx.javafxFactory.*
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
    Application.launch(Main3::class.java)
}

//it.consume()//取消原有事件
class Main3 : Application() {
    override fun start(primaryStage: Stage) {
        val button = ButtonFactory.button("关闭窗口", EventHandler {
            val b = DialogFactory.booleanDialog(primaryStage)
            if (b) {
                primaryStage.close()
            } else {
                println("no")
            }
        })

        val stackPane = PaneFactory.stackPane().apply {
            children.add(button)
        }

        val scene = SceneFactory.scene(stackPane)

        StageFactory.stage(primaryStage, scene = scene).apply {
            onCloseRequest = EventHandler {
                it.consume()//取消原有事件
                button.onAction.handle(null)
            }
        }.show()
    }
}