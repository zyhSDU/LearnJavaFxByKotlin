package fx.main.main2

import fx.javafxFactory.PaneFactory
import fx.javafxFactory.SceneFactory
import fx.javafxFactory.StageFactory
import javafx.application.Application
import javafx.scene.Group
import javafx.scene.Scene
import javafx.stage.Stage

/**
 * @program: LearnJavaFxByKotlin
 * @description:
 * @author: 张宇涵
 * @create: 2020-08-05 00:06
 */
abstract class BaseApp : Application() {
    override fun start(primaryStage: Stage) {
        val group = PaneFactory.group()
        val scene = SceneFactory.scene(group)
        StageFactory.stage(primaryStage, scene = scene).apply {
            width = 800.0
            height = 800.0
        }
        initStart(primaryStage, scene, group)
        primaryStage.show()
    }

    protected abstract fun initStart(primaryStage: Stage, scene: Scene, group: Group)
}