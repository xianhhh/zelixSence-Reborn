package modules.render;

import modules.Category;
import modules.Module;
import org.lwjgl.input.Keyboard;

public class DrawRect extends Module {

    public DrawRect() {
        super("DrawRect", Keyboard.KEY_O, Category.Render);
    }
}
