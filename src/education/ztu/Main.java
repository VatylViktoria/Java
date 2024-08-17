package education.ztu;

import java.lang.reflect.Method;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException {
        // Task 1
        Task1.doTask();

        // Task 2
        Task2 task2 = new Task2();
        System.out.println(Task2.class.getSimpleName());
        System.out.println(task2.getClass().getSimpleName());
        System.out.println(Class.forName("education.ztu.Task2").getSimpleName());
        System.out.println(task2.getNumber());
        System.out.println("Fields: " + Arrays.toString(Task2.class.getDeclaredFields()));
        System.out.println("Methods: " + Arrays.toString(Task2.class.getDeclaredMethods()));
        System.out.println("Constructors: " + Arrays.toString(Task2.class.getDeclaredConstructors()));

        // Task 3
        Method[] methods = task2.getClass().getDeclaredMethods();
        for (Method method : methods) {
            if (method.isAnnotationPresent(Annotable.class)) {
                Annotable annotable = method.getAnnotation(Annotable.class);
                System.out.printf("%nValue: %s", annotable.key());
            }
        }
    }
}