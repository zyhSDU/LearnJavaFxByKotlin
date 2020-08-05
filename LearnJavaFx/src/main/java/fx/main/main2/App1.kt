package fx.main.main2

import fx.javafxFactory.ButtonFactory
import fx.javafxFactory.PaneFactory
import javafx.application.Application
import javafx.event.EventHandler
import javafx.geometry.Insets
import javafx.scene.Scene
import javafx.scene.layout.AnchorPane
import javafx.scene.layout.Pane
import javafx.stage.Stage

fun main() {
    Application.launch(App1::class.java)
}

class App1 : BaseApp() {
    override fun initStart(primaryStage: Stage, scene: Scene, anchorPane: AnchorPane) {
        val button1 = ButtonFactory.button("b1")
        val button2 = ButtonFactory.button("b2")
        anchorPane.apply {
            style="-fx-background-color:#FF6666"
            onMouseClicked= EventHandler {
                println("App2.initStart")
            }
            children.addAll(button1,button2)
            //        AnchorPane.setTopAnchor(button1,100.0)//这个生效的优先级比layoutXY高
            PaneFactory.setTopRightBottomLeft(button1, 0.0)///////////////////////
            padding= Insets(10.0)//内边距
            //
//            button1.isManaged//是否受父容器管理
//            button1.isVisible//是否可见//不可点击
//            button1.opacity//透明度//可点击
            //

        }

    }
}