package zelix.Event;

import java.lang.annotation.*;

/**
 * 用法
 * 用来识别Event的模式 类型 用法 发送模式
 *
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE_USE)
public @interface EventTarget {
    Type value() default Type.POST;


}
