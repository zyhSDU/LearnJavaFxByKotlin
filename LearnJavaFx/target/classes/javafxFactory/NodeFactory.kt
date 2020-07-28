package fx.javafxFactory

import fx.res.PairDoubleEnum
import javafx.scene.Node

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
}