package zelix.module.player;

import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.gameevent.TickEvent;
import org.lwjgl.input.Keyboard;
import zelix.module.Category;
import zelix.module.Module;

public class Test extends Module {
    public Test(){
        super("test", Category.Player, Keyboard.KEY_O);
    }

    @EventHandler
    public void onTick(TickEvent e){
        mc.player.jump();
    }

}
