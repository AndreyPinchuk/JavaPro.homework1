package Hometasck2;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) {
        TextContainer textContainer = new TextContainer();
        Class<?> cl = textContainer.getClass();


        if (cl.isAnnotationPresent(SaveTo.class)) {

            SaveTo saveTo = cl.getAnnotation(SaveTo.class);
            String path = saveTo.path();
            Method[] methods = cl.getDeclaredMethods();

            for (Method method : methods) {
                if (method.isAnnotationPresent(Saver.class)) {
                    try {
                        method.invoke(textContainer, path);
                    } catch (IllegalAccessException | InvocationTargetException e) {
                        e.printStackTrace();
                    } finally {
                        System.out.println("Complet!");
                    }
                }
            }

        }
    }
}
