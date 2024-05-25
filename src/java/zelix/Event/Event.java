package zelix.Event;

import zelix.Zelix;

public class Event {
    private boolean cancel;
    private Type t;
    private Object o;
    public Event(Type t){
        Zelix.event.register(o);
        this.t = t;
    }

    public void setCancel(Boolean cancel){
        if(cancel){
            this.cancel = true;
        }
        if(cancel == false){
            this.cancel = false;
        }
    }

    public void call(Object o){
        this.o = o;
        Zelix.event.register(o);
    }
    
    public Object getObject(){
        return this;
    }

}
