package zelix.module;

import zelix.module.player.*;

import java.util.ArrayList;

public class ModuleManager {
    public ArrayList<Module> modules;

    public ModuleManager() {
        modules = new ArrayList<Module>();
    }

    public ArrayList<Module> getModules() {
        return modules;
    }

    private void addModule(Module m){
        modules.add(m);
    }

    public void register(){
        addModule(new Test());
    }

    public void onKey(int key){
        for(Module m : modules){
            if (m.getKey() == key) {
                m.setToggle();
            }
        }
    }
}
