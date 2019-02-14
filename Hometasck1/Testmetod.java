package Hometasck1;

import java.lang.annotation.*;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Target(value= METHOD)
@Retention(value= RUNTIME)
public @interface Testmetod {
    int a();
    int b();
}
