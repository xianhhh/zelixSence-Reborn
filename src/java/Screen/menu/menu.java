package Screen.menu;

import Screen.buttons.test;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;

public class menu extends GuiScreen {

    public menu(){
        initGui();
    }
    @Override
    public void initGui() {
        this.buttonList.add(new test());
    }
}
