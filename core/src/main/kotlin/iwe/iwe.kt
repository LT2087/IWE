package iwe

import com.badlogic.gdx.Game
import iwe.FirstScreen
import ktx.app.KtxGame
import ktx.app.KtxScreen

/** [com.badlogic.gdx.ApplicationListener] implementation shared by all platforms.  */
class iwe : KtxGame<KtxScreen>() {
    override fun create() {
        setScreen(FirstScreen())
    }
}