package modules.movement;


import com.google.common.eventbus.Subscribe;
import modules.Category;
import modules.Module;
import org.lwjgl.input.Keyboard;

public class sprint extends Module{
    public sprint() {
        super("sprint", Keyboard.KEY_R,Category.Movement);
    }


    public void onEnable() {
        Module.mc.thePlayer.jump();
    }
}
