package fx.javafxFactory

import fx.res.PairDoubleEnum
import javafx.event.EventHandler
import javafx.geometry.Pos
import javafx.scene.control.Button
import javafx.scene.control.Label
import javafx.scene.layout.VBox
import javafx.stage.Modality
import javafx.stage.Stage

object DialogFactory {
    fun booleanDialog(ownerStage: Stage,title: String = "title", msg: String = "msg"): Boolean{
        var answer = false

        val stage = Stage().apply {
            //绑定父舞台，设置自己为弹窗样式
            initOwner(ownerStage)
            initModality(Modality.WINDOW_MODAL)
            //
            this.title = title
        }

        val label = Label(msg)
        val buttonYes = Button("是").apply {
            onMouseClicked = EventHandler {
                answer = true
                stage.close()
            }
        }
        val buttonNo = Button("否").apply {
            onMouseClicked = EventHandler {
                answer = false
                stage.close()
            }
        }

        // 创建布局
        val vBox = VBox().apply {
            children.addAll(label, buttonYes, buttonNo)
            alignment = Pos.CENTER // 布局居中显示
        }

        stage.apply {
            this.scene = SceneFactory.scene(vBox, PairDoubleEnum.w200h200)
            showAndWait()
        }
        return answer
    }
}