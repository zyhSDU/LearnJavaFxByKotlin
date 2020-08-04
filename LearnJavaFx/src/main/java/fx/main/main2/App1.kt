package fx.main.main2

import fx.javafxFactory.ButtonFactory
import fx.javafxFactory.PaneFactory
import javafx.application.Application
import javafx.event.EventHandler
import javafx.geometry.Insets
import javafx.scene.Scene
import javafx.scene.layout.AnchorPane
import javafx.stage.Stage

fun main() {
    Application.launch(App2::class.java)
}

class App2 : BaseApp() {
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
            padding= Insets(10.0)
        }

    }
}