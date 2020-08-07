package fx.util

import javafx.fxml.FXMLLoader
import javafx.scene.Parent
import java.io.IOException

/**
 * @program: javafxRoot
 * @description:
 * @author: 张宇涵
 * @create: 2020-07-24 23:16
 */
object Util {
    object LoadUtil {
        @Throws(IOException::class)
        fun <E : Parent, F> loadFXMLL(viewURL: String="view/View1.fxml"): Pair<E, F> {
            val fxmlLoader = FXMLLoader()
            fxmlLoader.location = javaClass.classLoader.getResource(viewURL)
            val parent = fxmlLoader.load<E>()
            val controller = fxmlLoader.getController<F>()
            return Pair(parent, controller)
        }
    }

    object ThreadUtil {
        fun printlnCurrentThreadName() {
            println("\tin ${Thread.currentThread().name}")
        }
    }
}