package fx.controller

import javafx.fxml.FXML
import javafx.scene.control.Label

/**
 * @program: javafxRoot
 * @description:
 * @author: 张宇涵
 * @create: 2020-07-19 23:18
 */
class Controller1 {
    @FXML
    lateinit var label: Label

    fun changeLabelVisible() {
        label.isVisible = !label.isVisible
    }
}