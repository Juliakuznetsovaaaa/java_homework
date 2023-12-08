package _04;

class MyClass {
    private int value;

    //Геттер для получения значения
    public int getValue() {
        return value;
    }

    //Сеттер для установки значения
    public void setValue(int value) {
        this.value = value;
    }

    //Метод для обмена значениями между двумя объектами
    public static void swapValues(MyClass obj1, MyClass obj2) {
        int temp = obj1.getValue();
        obj1.setValue(obj2.getValue());
        obj2.setValue(temp);
    }
}

public class _7_classes {
    public static void main(String[] args) {
        MyClass obj1 = new MyClass();
        obj1.setValue(5);
        MyClass obj2 = new MyClass();
        obj2.setValue(10);

        System.out.println("Before swap:");
        System.out.println("obj1 value: " + obj1.getValue()); // Вывод: 5
        System.out.println("obj2 value: " + obj2.getValue()); // Вывод: 10

        //Обмен значениями
        MyClass.swapValues(obj1, obj2);

        System.out.println("After swap:");
        System.out.println("obj1 value: " + obj1.getValue()); // Вывод: 10
        System.out.println("obj2 value: " + obj2.getValue()); // Вывод: 5
    }
}

