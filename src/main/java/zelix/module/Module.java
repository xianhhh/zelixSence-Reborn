package zelix.module;

import net.minecraft.client.Minecraft;

public class Module {
    protected static final Minecraft mc = Minecraft.getMinecraft();
    public Category category;
    public String name;
    public int key;
    public boolean toggle;

    public boolean isToggle() {
        return toggle;
    }

    public void setToggle() {
        this.toggle = !this.toggle;
        if (this.toggle){
            onEnable();
        }else {
            onDisable();
        }
    }

    public Module(String name, Category category, int key) {
        this.name = name;
        this.category = category;
        this.key = key;
        toggle = false;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }

    public Module(String name, Category category) {
        this.name = name;
        this.category = category;
        toggle = false;
    }

    private void register(){

    }

    public void onEnable() {

    }

    public void onDisable() {

    }
}
