package zelix.modules.render;

import zelix.modules.Category;
import zelix.modules.Module;
import org.lwjgl.input.Keyboard;

public class DrawRect extends Module {

    public DrawRect() {
        super("DrawRect", Keyboard.KEY_O, Category.Render);
    }
}
