package fx.javafxFactory

import fx.res.PairDoubleEnum
import javafx.scene.Parent
import javafx.scene.Scene

/**
 * @program: javafxRoot
 * @description:
 * @author: 张宇涵
 * @create: 2020-07-19 22:00
 */
object SceneFactory {
    fun scene(root: Parent, d: PairDoubleEnum): Scene {
        return Scene(root, d.arg1, d.arg2).apply {
//            cursor= Cursor.CLOSED_HAND//光标变成一只手
//            cursor= Cursor.MOVE//光标变成一个四向标志
//            println(javaClass.classLoader.getResource("icon/1.png").toExternalForm())
//            cursor = Cursor.cursor(javaClass.classLoader.getResource("icon/1.png").toExternalForm())//路径存在，但不知道为什么不生效
        }
    }
}