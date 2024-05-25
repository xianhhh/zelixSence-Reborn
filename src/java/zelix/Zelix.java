package zelix;

import zelix.Event.event.UpdateEvent;
import zelix.Screen.ScreenManager;
import com.google.common.eventbus.EventBus;
import zelix.modules.ModuleManager;
import org.lwjgl.opengl.Display;

public class Zelix {

    public static void titles(){
        Display.setTitle("Zelix");
    }

    public static ScreenManager scm;

    public static EventBus event = new EventBus();

    public static ModuleManager m = new ModuleManager();
    public static void loads(){
        m.register();

    }
}
