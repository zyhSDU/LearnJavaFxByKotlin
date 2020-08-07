package sample

import javafx.application.Application
import javafx.event.EventHandler
import javafx.fxml.FXMLLoader
import javafx.geometry.Pos
import javafx.scene.Parent
import javafx.scene.Scene
import javafx.scene.control.Button
import javafx.scene.control.Label
import javafx.scene.input.MouseEvent
import javafx.scene.layout.StackPane
import javafx.scene.layout.VBox
import javafx.stage.Modality
import javafx.stage.Stage
import javafx.stage.WindowEvent
import kotlin.jvm.Throws


class Main1 : Application() {
    @Throws(Exception::class)
    override fun start(primaryStage: Stage) {
        val root = FXMLLoader.load<Parent>(javaClass.getResource("sample.view"))
        primaryStage.title = "Hello World"
        primaryStage.scene = Scene(root, 300.0, 275.0)
        primaryStage.show()
    }
}

class Main2 : Application() {
    @Throws(Exception::class)
    override fun start(primaryStage: Stage) {
        primaryStage.show()
    }
}

class Main3 : Application() {
    @Throws(Exception::class)
    override fun start(primaryStage: Stage) {
        // 实例化按钮
        val button = Button("这是按钮上的文字")

        // 创建布局控件
        val stackPane = StackPane()

        // 将button添加到布局
        stackPane.children.add(button)

        // 创建场景 宽=400 高=400
        val scene = Scene(stackPane, 400.0, 400.0)

        // 将场景添加到窗口
        primaryStage.scene = scene

        // 显示窗口
        primaryStage.show()
    }
}

class Main4 : Application() {
    @Throws(Exception::class)
    override fun start(primaryStage: Stage) {
        val button = Button("这是按钮")
        button.onMouseClicked = EventHandler {
            println("鼠标点击按钮了")
        }
        val stackPane = StackPane().apply {
            children.add(button)
        }
        val scene = Scene(stackPane, 400.0, 400.0)
        scene.onMousePressed = EventHandler {
            if (it.source === button) {
                println("点击了按钮")
            } else {
                println("点击了场景")
            }
        }
        primaryStage.scene = scene
        primaryStage.show()
    }
}

class SceneChange : Application() {
    @Throws(Exception::class)
    override fun start(primaryStage: Stage) {
        // 场景1
        val button1 = Button("场景1 的button")
        val vBox = VBox()
        vBox.children.add(button1)
        val scene1 = Scene(vBox, 400.0, 400.0)


        val button2 = Button("场景2 的button")

        val stackPane = StackPane()
        stackPane.children.add(button2)
        val scene2 = Scene(stackPane, 400.0, 400.0)
        primaryStage.scene = scene1

        button1.onMouseClicked = EventHandler {
            primaryStage.scene = scene2
        }
        button2.onMouseClicked = EventHandler {
            primaryStage.scene = scene1
        }
        primaryStage.show()
    }

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            launch(*args)
        }
    }
}

class Main5 : Application() {
    @Throws(Exception::class)
    override fun start(primaryStage: Stage) {
        primaryStage.onCloseRequest = EventHandler { event: WindowEvent ->
            event.consume() // 消除默认事件
            handleClose(primaryStage)
        }

        val button = Button("关闭窗口").apply {
            onMouseClicked = EventHandler {
                handleClose(primaryStage)
            }
        }
        val vBox = VBox().apply {
            children.add(button)
        }
        val scene = Scene(vBox, 400.0, 400.0)
        primaryStage.scene = scene
        primaryStage.show()
    }

    private fun handleClose(stage: Stage) {
        if (WindowAlert.display("关闭窗口", "是否关闭窗口？")) {
            stage.close()
        }
    }
}

object WindowAlert {
    var answer = false
    fun display(title: String?, msg: String?): Boolean {
        val stage = Stage()

        // 设置显示模式
        stage.initModality(Modality.APPLICATION_MODAL)
        stage.title = title

        // 创建控件
        val buttonYes = Button("是")
        buttonYes.onMouseClicked = EventHandler {
            answer = true
            stage.close()
        }
        val buttonNo = Button("否")
        buttonNo.onMouseClicked = EventHandler {
            answer = false
            stage.close()
        }
        val label = Label(msg)

        // 创建布局
        val vBox = VBox()
        vBox.children.addAll(label, buttonYes, buttonNo)
        vBox.alignment = Pos.CENTER // 布局居中显示

        // 创建场景
        val scene = Scene(vBox, 200.0, 200.0)

        stage.scene = scene
        stage.showAndWait()

        return answer
    }
}


fun main() {
//    Application.launch(Main1::class.java)
//    Application.launch(Main2::class.java)
//    Application.launch(Main3::class.java)
    Application.launch(Main4::class.java)
//    Application.launch(SceneChange::class.java)
//    Application.launch(Main5::class.java)
}