package _04;
public class _7_classes {
    public static <T> void swapValues(Wrapper<T> obj1, Wrapper<T> obj2) {
        T temp = obj1.getValue();
        obj1.setValue(obj2.getValue());
        obj2.setValue(temp);
    }

    public static void main(String[] args) {
        Wrapper<Integer> obj1 = new Wrapper<>(5);
        Wrapper<Integer> obj2 = new Wrapper<>(10);

        System.out.println("Before swap:");
        System.out.println("obj1 value: " + obj1.getValue()); // Вывод: 5
        System.out.println("obj2 value: " + obj2.getValue()); // Вывод: 10

        // Обмен значениями
        swapValues(obj1, obj2);

        System.out.println("After swap:");
        System.out.println("obj1 value: " + obj1.getValue()); // Вывод: 10
        System.out.println("obj2 value: " + obj2.getValue()); // Вывод: 5
    }
}


