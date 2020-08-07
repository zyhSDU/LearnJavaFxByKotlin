package fx.javafxFactory

import fx.res.PairDoubleEnum
import javafx.beans.NamedArg
import javafx.scene.Node
import javafx.scene.layout.AnchorPane

/**
 * @program: javafxRoot
 * @description:
 * @author: 张宇涵
 * @create: 2020-07-26 12:24
 */
object NodeFactory {
    fun Node.setLayoutXY(pairDoubleEnum: PairDoubleEnum) {
        layoutX = pairDoubleEnum.arg1
        layoutY = pairDoubleEnum.arg2
    }

    //这个生效的优先级比layoutXY高
    fun Node.setAnchorPaneTopRightBottomLeftAnchor(@NamedArg("topRightBottomLeft") topRightBottomLeft: Double) {
        AnchorPane.setTopAnchor(this, topRightBottomLeft)
        AnchorPane.setRightAnchor(this, topRightBottomLeft)
        AnchorPane.setBottomAnchor(this, topRightBottomLeft)
        AnchorPane.setLeftAnchor(this, topRightBottomLeft)
    }

    fun Node.setAnchorPaneTopRightBottomLeftAnchor(top: Double, right: Double, bottom: Double, left: Double) {
        AnchorPane.setTopAnchor(this, top)
        AnchorPane.setRightAnchor(this, right)
        AnchorPane.setBottomAnchor(this, bottom)
        AnchorPane.setLeftAnchor(this, left)
    }
}