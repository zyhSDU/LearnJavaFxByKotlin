package fx.javafxFactory

import javafx.event.EventHandler
import javafx.scene.control.Label
import javafx.scene.control.PasswordField
import javafx.scene.control.TextField
import javafx.scene.control.Tooltip
import javafx.scene.paint.Paint
import javafx.scene.text.Font

/**
 * @program: LearnJavaFxByKotlin
 * @description:
 * @author: 张宇涵
 * @create: 2020-08-04 00:21
 */
object ControlFactory {
    fun textFieldEnum1(): TextField {
        return TextField().apply {
//            text = "text"
            layoutX = 100.0
            layoutY = 100.0
            font = Font.font(14.0)
            style
            tooltip= Tooltip("tooltip").apply {
                font= Font.font(40.0)
            }
            promptText="请输入"
            isFocusTraversable=false//取消焦点
            textProperty().addListener { observable, oldValue, newValue ->
                println(newValue)
            }
            selectedTextProperty().addListener { observable, oldValue, newValue ->
                println(newValue)
            }
        }
    }
    fun passwordFieldEnum1():PasswordField{
        return PasswordField().apply {
            layoutX = 300.0
            layoutY = 100.0
        }
    }
    fun labelEnum1():Label{
        return Label().apply {
            text="标签"
            layoutX = 0.0
            layoutY = 100.0
            textFill= Paint.valueOf("red")
            onMouseClicked= EventHandler {
                println("ControlFactory.labelEnum1")
            }
        }
    }
}