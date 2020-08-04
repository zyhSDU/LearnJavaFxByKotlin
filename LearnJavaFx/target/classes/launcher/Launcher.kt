package fx.launcher

import fx.main.main1.*
import javafx.application.Application

/**
 * @program: javafxRoot
 * @description:
 * @author: 张宇涵
 * @create: 2020-07-19 21:39
 */

class Launcher {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            println("Launcher.main")
//            Application.launch(Main0::class.java)
//            Application.launch(Main1::class.java)
//            Application.launch(Main2::class.java)
//            Application.launch(Main3::class.java)
//            Application.launch(Main4::class.java)
//            Application.launch(Main5Platform::class.java)
//            Application.launch(Main6::class.java)
//            Application.launch(Main8::class.java)
            Application.launch(Main9Base::class.java)
        }
    }
}
