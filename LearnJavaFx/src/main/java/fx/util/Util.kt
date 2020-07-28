package fx.util

import javafx.fxml.FXMLLoader
import javafx.scene.Parent
import java.io.IOException
import kotlin.jvm.Throws

/**
 * @program: javafxRoot
 * @description:
 * @author: 张宇涵
 * @create: 2020-07-24 23:16
 */
object Util {
    object LoadUtil {
        @Throws(IOException::class)
        fun loadFXMLL(name: String): Parent {
            return FXMLLoader.load<Parent>(javaClass.classLoader.getResource(name))
        }
    }

    object ThreadUtil {
        fun printlnCurrentThreadName() {
            println("\tin ${Thread.currentThread().name}")
        }
    }
}