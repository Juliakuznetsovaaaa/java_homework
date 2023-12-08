package _06;
import _02._1_String;
import _04._7_classes;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
public class _8_reflection {
    public static void printClassInfo(Class<?> clazz) {
        String className = clazz.getName();
        System.out.println("Class name: " + className);

        System.out.println("Fields:");
        Field[] fields = clazz.getDeclaredFields();
        for (Field field : fields) {
            int modifiers = field.getModifiers();
            System.out.println(Modifier.toString(modifiers) + " " + field.getType().getName() + " " + field.getName());
        }

        System.out.println("Methods:");
        Method[] methods = clazz.getDeclaredMethods();
        for (Method method : methods) {
            int modifiers = method.getModifiers();
            String methodName = method.getName();
            String returnType = method.getReturnType().getName();
            String parameters = Arrays.toString(method.getParameterTypes());
            System.out.println(Modifier.toString(modifiers) + " " + returnType + " " + methodName + parameters);
        }
    }

    public static void main(String[] args) {
        printClassInfo(String.class); //Вывод информации о классе String
    }
}

