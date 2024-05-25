package zelix.modules;

import zelix.modules.movement.sprint;

import java.util.ArrayList;

public class ModuleManager {
   public static ArrayList<Module> modules;
    public ModuleManager(){
       modules = new ArrayList<Module>();
    }

    public static void addModule(Module m){
       modules.add(m);
    }

    public void register(){
       addModule(new sprint());
    }

    public void onKey(int key) {
        for(Module m : ModuleManager.modules){
            if (m.getKey() == key) {
                m.settoggle();
            }
        }
    }

    public static int getmoduleKey(Module module){
       return module.key;
    }
}
