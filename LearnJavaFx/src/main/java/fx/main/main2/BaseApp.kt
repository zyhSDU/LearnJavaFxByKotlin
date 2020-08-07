package fx.main.main2

import fx.javafxFactory.SceneFactory
import fx.javafxFactory.StageFactory
import fx.res.PairDoubleEnum
import fx.util.Util
import javafx.application.Application
import javafx.application.Platform
import javafx.scene.Scene
import javafx.scene.layout.AnchorPane
import javafx.stage.Stage

/**
 * @program: LearnJavaFxByKotlin
 * @description:
 * @author: 张宇涵
 * @create: 2020-08-05 00:06
 */
/*
Main0.init
	in JavaFX-Launcher
Main0.start
	in JavaFX Application Thread
Main0.stop
	in JavaFX Application Thread
 */
abstract class BaseApp : Application() {
    @Throws(Exception::class)
    override fun init() {
        super.init()
    }

    override fun start(primaryStage: Stage) {
        val pane = AnchorPane()
        val scene = SceneFactory.scene(pane)
        StageFactory.stage(primaryStage, scene = scene, pairDoubleEnum = PairDoubleEnum.w800h800)
        initStart(primaryStage, scene, pane)
        primaryStage.show()
    }

    protected abstract fun initStart(primaryStage: Stage, scene: Scene, anchorPane: AnchorPane)

    @Throws(Exception::class)
    override fun stop() {
        super.stop()
//        //空闲时执行
//        Platform.runLater {
//            Util.ThreadUtil.printlnCurrentThreadName()
//        }
//        Platform.setImplicitExit(false)//当最后一个窗口关闭时，程序不退出
//        println(Platform.isSupported(ConditionalFeature.SCENE3D))//是否支持扫描3D
//        println(Platform.isSupported(ConditionalFeature.FXML))//是否支持FXML
//        Platform.exit()//窗口关闭，程序关闭
//        println(Screen.getPrimary())//获取本机屏幕信息
    }
}