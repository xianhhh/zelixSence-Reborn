package modules;


;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import zelix.Zelix;

public class Module {
    protected static final Minecraft mc = Minecraft.getMinecraft();
    public int key;
    public boolean toggle;
    public String name;
    public Category category;

    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }


    public boolean isToggle() {
        return toggle;
    }

    public void settoggle() {
        this.toggle = !this.toggle;
        if(toggle == true){
            onEnable();
        }
        if(toggle == false){
            onDisable();
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Module(String name, int key, Category category){
        this.name = name;
        this.key = key;
        this.category = category;
        this.toggle = false;
    }

    public void onEnable(){
        //Zelix.event.register(this);
    }

    public void onDisable(){
        //Zelix.event.unregister(this);
    }
}
