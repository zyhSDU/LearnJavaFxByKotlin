package fx.javafxFactory

import javafx.beans.NamedArg
import javafx.scene.Group
import javafx.scene.Node
import javafx.scene.layout.AnchorPane
import javafx.scene.layout.BorderPane

object PaneFactory {
    fun group(): Group {
        return Group()
    }

    fun setTopRightBottomLeft(node: Node, @NamedArg("topRightBottomLeft") topRightBottomLeft: Double) {
        AnchorPane.setTopAnchor(node, topRightBottomLeft)
        AnchorPane.setBottomAnchor(node, topRightBottomLeft)
        AnchorPane.setLeftAnchor(node, topRightBottomLeft)
        AnchorPane.setRightAnchor(node, topRightBottomLeft)
    }

    fun borderPane(): BorderPane {
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
}