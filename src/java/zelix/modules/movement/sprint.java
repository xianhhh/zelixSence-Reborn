package zelix.modules.movement;


import com.google.common.eventbus.Subscribe;
import zelix.Event.EventTarget;
import zelix.Event.event.UpdateEvent;
import zelix.modules.Category;
import zelix.modules.Module;
import org.lwjgl.input.Keyboard;

public class sprint extends Module{
    public sprint() {
        super("sprint", Keyboard.KEY_R,Category.Movement);
    }

    @Subscribe
    public void onUpdate(UpdateEvent e) {
        Module.mc.thePlayer.jump();
    }
}
