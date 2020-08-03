package fx.javafxFactory

import fx.res.PairDoubleEnum
import javafx.event.Event
import javafx.scene.Parent
import javafx.scene.Scene
import javafx.scene.input.KeyCode
import javafx.scene.input.KeyCodeCombination
import javafx.scene.input.KeyCombination
import javafx.scene.input.MouseEvent

/**
 * @program: javafxRoot
 * @description:
 * @author: 张宇涵
 * @create: 2020-07-19 22:00
 */
object SceneFactory {
    fun scene(root: Parent, d: PairDoubleEnum = PairDoubleEnum.w800h800): Scene {
        return Scene(root, d.arg1, d.arg2).apply {
//            cursor= Cursor.CLOSED_HAND//光标变成一只手
//            cursor= Cursor.MOVE//光标变成一个四向标志
//            println(javaClass.classLoader.getResource("icon/1.png").toExternalForm())
//            cursor = Cursor.cursor(javaClass.classLoader.getResource("icon/1.png").toExternalForm())//路径存在，但不知道为什么不生效
        }
    }

    fun sceneEnum1(root: Parent, d: PairDoubleEnum = PairDoubleEnum.w800h800, runnable: Runnable = Runnable {
        println("SceneFactory.sceneEnum1")
    }): Scene {
        return Scene(root, d.arg1, d.arg2).apply {
            //ctrl+a
            accelerators[KeyCodeCombination(KeyCode.A, KeyCombination.SHORTCUT_DOWN)] = runnable
        }
    }
}