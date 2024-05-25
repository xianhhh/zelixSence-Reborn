package Events;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface EventTarget {
    byte value() default 2;
    EventPriority priority() default EventPriority.LOW;

    boolean ignoreCondition() default false;

}

class enum EventPriority(){

    LOW(0), MEDIUM(1), HIGH(2);

    private int value;

    EventPriority(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
