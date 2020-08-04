package fx.javafxFactory

import javafx.beans.NamedArg
import javafx.scene.Group
import javafx.scene.Node
import javafx.scene.layout.AnchorPane

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
}