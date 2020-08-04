package fx.main.main2

import fx.javafxFactory.ControlFactory
import javafx.application.Application
import javafx.scene.Group
import javafx.scene.Scene
import javafx.stage.Stage

/**
 * @program: LearnJavaFxByKotlin
 * @description:
 * @author: 张宇涵
 * @create: 2020-08-05 00:08
 */
fun main() {
    Application.launch(App1::class.java)
}

class App1 : BaseApp() {
    override fun initStart(primaryStage: Stage, scene: Scene, group: Group) {
        val labelEnum1 = ControlFactory.labelEnum1()
        val textFieldEnum1 = ControlFactory.textFieldEnum1()
        val passwordFieldEnum1 = ControlFactory.passwordFieldEnum1()
        group.children.addAll(labelEnum1, textFieldEnum1, passwordFieldEnum1)
    }
}