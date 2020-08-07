package fx.javafxFactory

import javafx.geometry.Insets
import javafx.geometry.Orientation
import javafx.geometry.Pos
import javafx.scene.Group
import javafx.scene.layout.*

object PaneFactory {
    fun group(): Group {
        return Group()
    }

    fun stackPane(): StackPane {
        return StackPane()
    }

    fun borderPane(): BorderPane {
        return BorderPane()
    }

    fun borderPaneEnum1(): BorderPane {
        return BorderPane().apply {
//            top = AnchorPane()
//            bottom = AnchorPane()
//            left = AnchorPane()
//            right = AnchorPane()

//            padding//给自己，设置内边距
//            BorderPane.setMargin()//给里面的某个组件，设置外边距外边距
//            BorderPane.setAlignment()//给里面的某个组件，设置方位
        }
    }

    fun vBox(): VBox {
        return VBox()
    }

    fun vBoxEnum1(): VBox {
        return vBox().apply {
            alignment = Pos.CENTER // 布局居中显示
        }
    }

    fun hBox(): HBox {
        return HBox()
    }
    fun flowPane():FlowPane{
        return FlowPane()
    }
    fun flowPaneEnum0():FlowPane{
        return flowPane().apply {
//            padding= Insets(10.0)//内边距
//            FlowPane.setMargin(b1,Insets(10.0))//给b1设置外边距
//            alignment=Pos.CENTER//方位
//            hgap//水平间距
//            vgap//竖直间距
//            orientation=Orientation.HORIZONTAL//设置布局方向，水平，默认
//            orientation=Orientation.VERTICAL//设置布局方向，垂直
        }
    }
}