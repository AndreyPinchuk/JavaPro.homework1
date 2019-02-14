package Hometasck1;

import java.lang.reflect.Method;

public class ReflectionClass {

       public static void Reflection (Class < ? >...ls){

            try {
                for (Class<?> l : ls) {
                   Method[] methods = l.getDeclaredMethods();

                    for (Method method : methods) {
                        if (method.isAnnotationPresent(Testmetod.class)) {
                            Testmetod testmetod = method.getAnnotation(Testmetod.class);
                            method.invoke(l,testmetod.a(),testmetod.b());

                        }
                    }
                }
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }
