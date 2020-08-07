package fx.main.main1

import fx.javafxFactory.PaneFactory
import fx.javafxFactory.SceneFactory
import fx.javafxFactory.StageFactory
import fx.javafxFactory.ControlFactory
import javafx.application.Application
import javafx.stage.Stage

/**
 * @program: LearnJavaFxByKotlin
 * @description:
 * @author: 张宇涵
 * @create: 2020-08-04 00:17
 */
class Main9Base : Application() {
    override fun start(primaryStage: Stage) {
        val group = PaneFactory.group()
        val scene = SceneFactory.sceneEnum0(group)
        StageFactory.stageEnum0(primaryStage, scene = scene).apply {
            width = 800.0
            height = 800.0
        }

        val labelEnum1 = ControlFactory.labelEnum1()
        val textFieldEnum1 = ControlFactory.textFieldEnum1()
        val passwordFieldEnum1 = ControlFactory.passwordFieldEnum1()
        group.children.addAll(labelEnum1, textFieldEnum1, passwordFieldEnum1)


        primaryStage.show()
    }
}