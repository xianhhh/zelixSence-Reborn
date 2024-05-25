package zelix.Screen;

import zelix.Screen.menu.menu;
import net.minecraft.client.gui.GuiScreen;

public class ScreenManager extends GuiScreen {
    @Override
    public void initGui() {
        mc.displayGuiScreen(new menu());
    }
}
