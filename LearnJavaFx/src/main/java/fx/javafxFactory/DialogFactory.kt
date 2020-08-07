package fx.javafxFactory

import fx.res.PairDoubleEnum
import javafx.event.EventHandler
import javafx.stage.Stage

object DialogFactory {
    fun booleanDialog(ownerStage: Stage, title: String = "title", msg: String = "msg"): Boolean {
        var answer = false

        val label = ControlFactory.label(msg)
        val buttonYes = ButtonFactory.button("是")
        val buttonNo = ButtonFactory.button("否")

        // 创建布局
        val vBox = PaneFactory.vBoxEnum1().apply {
            children.addAll(label, buttonYes, buttonNo)
        }

        val scene = SceneFactory.sceneEnum0(vBox, PairDoubleEnum.w200h200)

        val stage = StageFactory.stageWindow(title = title, scene = scene,ownerStage = ownerStage).apply {
            buttonYes.onMouseClicked = EventHandler {
                answer = true
                close()
            }
            buttonNo.onMouseClicked = EventHandler {
                answer = false
                close()
            }
        }
        stage.showAndWait()
        return answer
    }
}