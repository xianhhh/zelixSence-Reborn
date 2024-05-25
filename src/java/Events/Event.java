package Events;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
public class Event {
    public boolean cancel;
    public Type type;

    public enum Type(){
        PRE,POST
    }

    public Event(Type type){

    }
}
