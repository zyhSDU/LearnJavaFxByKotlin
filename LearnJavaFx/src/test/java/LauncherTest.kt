import fx.main.main1.Main6
import fx.main.main1.Main7Cursor
import fx.main.main1.Main8
import javafx.application.Application
import org.junit.Test

/**
 * @program: javafxRoot
 * @description:
 * @author: 张宇涵
 * @create: 2020-07-26 12:11
 */
class LauncherTest {
    @Test
    fun t1() {
        ////            Application.launch(Main0::class.java)
////            Application.launch(Main1::class.java)
////            Application.launch(Main2::class.java)
////            Application.launch(Main3::class.java)
////            Application.launch(Main4::class.java)
////            Application.launch(Main5Platform::class.java)
    }
    @Test
    fun t6(){
        Application.launch(Main6::class.java)
    }
    @Test
    fun t7(){
        Application.launch(Main7Cursor::class.java)
    }
    @Test
    fun t8(){
        Application.launch(Main8::class.java)
    }
}