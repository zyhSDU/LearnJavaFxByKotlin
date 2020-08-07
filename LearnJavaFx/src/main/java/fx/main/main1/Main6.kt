package fx.main.main1

import fx.javafxFactory.ButtonFactory
import fx.javafxFactory.PaneFactory
import fx.javafxFactory.SceneFactory
import fx.javafxFactory.StageFactory
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
        val group = PaneFactory.group().apply {
            children.add(button)
        }
        val scene = SceneFactory.scene(group, PairDoubleEnum.w400h400)
        StageFactory.stage(primaryStage, scene = scene).show()
    }
}