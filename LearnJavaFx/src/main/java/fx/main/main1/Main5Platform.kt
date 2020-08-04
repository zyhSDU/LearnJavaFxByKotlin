package fx.main.main1

import fx.javafxFactory.SceneFactory
import fx.javafxFactory.StageFactory
import fx.res.PairDoubleEnum
import javafx.application.Application
import javafx.application.Platform
import javafx.scene.control.Label
import javafx.stage.Stage

/**
 * @program: javafxRoot
 * @description:
 * @author: 张宇涵
 * @create: 2020-07-25 00:49
 */
class Main5Platform : Application() {
    override fun start(primaryStage: Stage) {
        StageFactory.stage(primaryStage, scene = SceneFactory.scene(Label("11111"), PairDoubleEnum.w400h400)).show()
//        //Platform.runLater，空闲时执行
//        Util.ThreadUtil.printlnCurrentThreadName()
//        Platform.runLater {
//            Util.ThreadUtil.printlnCurrentThreadName()
//        }
//        //
//        Platform.setImplicitExit(false)//当最后一个窗口关闭时，程序不退出
//        println(Platform.isSupported(ConditionalFeature.SCENE3D))//是否支持扫描3D
//        println(Platform.isSupported(ConditionalFeature.FXML))//是否支持FXML
//        Platform.exit()//窗口关闭，程序关闭


//        println(Screen.getPrimary())//获取本机屏幕信息


        Platform.exit()//窗口关闭，程序关闭
    }
}