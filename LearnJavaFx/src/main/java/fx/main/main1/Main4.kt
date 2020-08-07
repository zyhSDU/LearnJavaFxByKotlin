package fx.main.main1

import fx.controller.Controller1
import fx.javafxFactory.SceneFactory
import fx.javafxFactory.StageFactory
import fx.res.PairDoubleEnum
import fx.util.Util
import javafx.application.Application
import javafx.event.EventHandler
import javafx.fxml.FXMLLoader
import javafx.scene.Parent
import javafx.scene.layout.BorderPane
import javafx.stage.Stage

/**
 * @program: javafxRoot
 * @description: 舞台，场景，布局，控件，点击事件
 * @author: 张宇涵
 * @create: 2020-07-19 21:38
 */
fun main() {
    Application.launch(Main4::class.java)
}

class Main4 : Application() {
    override fun start(primaryStage: Stage) {
        val (parent, controller) = Util.LoadUtil.loadFXMLL<BorderPane, Controller1>("view/View1.fxml")
        val scene = SceneFactory.scene(parent, PairDoubleEnum.w400h400)

        StageFactory.stage(primaryStage, scene = scene).apply {
            heightProperty().addListener { observable, oldValue, newValue ->
                val string = "observable = [${observable.value}], oldValue = [${oldValue}], newValue = [${newValue}]"
                controller.label.text = string
                println(string)
            }
        }.show()
    }
}