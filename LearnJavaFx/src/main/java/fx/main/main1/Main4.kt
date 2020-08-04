package fx.main.main1

import fx.javafxFactory.SceneFactory
import fx.javafxFactory.StageFactory
import fx.res.PairDoubleEnum
import fx.util.Util.LoadUtil.loadFXMLL
import javafx.application.Application
import javafx.stage.Stage

/**
 * @program: javafxRoot
 * @description: 舞台，场景，布局，控件，点击事件
 * @author: 张宇涵
 * @create: 2020-07-19 21:38
 */
class Main4 : Application() {
    override fun start(primaryStage: Stage) {
        val scene = SceneFactory.scene(
                loadFXMLL("view/View1.fxml"),
                PairDoubleEnum.w400h400
        )

        StageFactory.stage(primaryStage, "", scene).apply {
            isFullScreen=true//设置全屏，必须设置scene
            heightProperty().addListener { observable, oldValue, newValue ->
                println("observable = [${observable.value}], oldValue = [${oldValue}], newValue = [${newValue}]")
            }
            show()
        }
    }
}