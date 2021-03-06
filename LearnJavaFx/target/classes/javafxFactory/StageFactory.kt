package fx.javafxFactory

import javafx.scene.Scene
import javafx.stage.Stage

/**
 * @program: javafxRoot
 * @description:
 * @author: 张宇涵
 * @create: 2020-07-25 00:33
 */
object StageFactory {
    fun stage(stage: Stage = Stage(), title: String = "标题", scene: Scene): Stage {
        stage.apply {
            this.title = title
            this.scene = scene

//            icons.add(Image("icon/1.png"))//设置最上角图标
//            isIconified = true//设置最小化
//            isMaximized = true//设置最大化
//            isResizable = false//设置不可改变窗口大小
//            width
//            height
//            maxHeight
//            maxWidth
//            minHeight
//            minWidth
//            //
//            heightProperty().addListener { observable, oldValue, newValue ->
//                println("observable = [${observable.value}], oldValue = [${oldValue}], newValue = [${newValue}]")
//            }
//            widthProperty().addListener { observable, oldValue, newValue ->
//                println("observable = [${observable.value}], oldValue = [${oldValue}], newValue = [${newValue}]")
//            }
//            xProperty().addListener { observable, oldValue, newValue ->
//                println("observable = [${observable.value}], oldValue = [${oldValue}], newValue = [${newValue}]")
//            }
//            yProperty().addListener { observable, oldValue, newValue ->
//                println("observable = [${observable.value}], oldValue = [${oldValue}], newValue = [${newValue}]")
//            }
//            //
//            isFullScreen=true//设置全屏，必须设置scene
//            opacity//透明度0-1
//            isAlwaysOnTop//置顶
//            //
//            initStyle(StageStyle.DECORATED)//normal
//            initStyle(StageStyle.UNDECORATED)//没有顶部条
//            initStyle(StageStyle.TRANSPARENT)//没有顶部条
//            initStyle(StageStyle.UTILITY)//右上角只有一个×
//            initStyle(StageStyle.UNIFIED)//消除顶部条和主窗体的边界
//            //

        }
        return stage
    }
}