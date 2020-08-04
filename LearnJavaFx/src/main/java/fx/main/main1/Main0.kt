package fx.main.main1

import fx.util.Util.ThreadUtil.printlnCurrentThreadName
import javafx.application.Application
import javafx.stage.Stage
import kotlin.jvm.Throws

/**
 * @program: javafxRoot
 * @description:    Application 的生命周期
 * @author: 张宇涵
 * @create: 2020-07-21 00:23
 */
class Main0 : Application() {
    @Throws(Exception::class)
    override fun init() {
        println("Main0.init")
        printlnCurrentThreadName()
    }

    @Throws(Exception::class)
    override fun start(primaryStage: Stage) {
        println("Main0.start")
        printlnCurrentThreadName()
        primaryStage.show()
        primaryStage.close()
    }

    @Throws(Exception::class)
    override fun stop() {
        println("Main0.stop")
        printlnCurrentThreadName()
    }
}
/*
Launcher.main
Main0.init
	in JavaFX-Launcher
Main0.start
	in JavaFX Application Thread
Main0.stop
	in JavaFX Application Thread

Process finished with exit code 0
 */