package fx.main

import fx.javafxFactory.ButtonFactory
import fx.javafxFactory.SceneFactory
import fx.res.PairDoubleEnum
import javafx.application.Application
import javafx.scene.Group
import javafx.stage.Stage

/**
 * @program: javafxRoot
 * @description:
 * @author: 张宇涵
 * @create: 2020-07-25 23:41
 */
class Main6 : Application() {
    override fun start(primaryStage: Stage) {
        val button = ButtonFactory.buttonEnum2("111")
        val group = Group().apply {
            children.add(button)
        }
        val scene = SceneFactory.scene(group, PairDoubleEnum.w400h400)

        primaryStage.scene = scene
        primaryStage.show()
    }

}