package Hometasck2;

import java.lang.annotation.*;

import static java.lang.annotation.RetentionPolicy.RUNTIME;


@Retention(value = RUNTIME)
public @interface SaveTo {
    String path();
}

@Retention(value = RUNTIME)
@interface Saver {
}
