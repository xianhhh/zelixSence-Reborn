package zelix.Event.event;

import zelix.Event.Event;
import zelix.Event.Type;

public class UpdateEvent extends Event {

    public UpdateEvent() {
        super(Type.POST);
    }
}
