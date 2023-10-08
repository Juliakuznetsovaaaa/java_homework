package _02;

public class _4_switch {
    public static void main(String[] args) {
        //типы данных, которые можно использовать в конструкции switch:
        int num = 2;
        char letter = 'B';
        MyEnum myEnum = MyEnum.TWO;
        byte x = 10;
        String day = "Thursday";

        //примеры
        System.out.print("int = "+num+"\nswitch result: ");
        switch (num) {
            case 1:
                System.out.println("int is 1");
                break;
            case 2:
                System.out.println("int is 2");
                break;
            default:
                System.out.println("int is not 1 or 2");
                break;
        }
        System.out.print("\nchar = "+letter+"\nswitch result: ");
        switch (letter) {
            case 'A':
                System.out.println("char is A");
                break;
            case 'B':
                System.out.println("char is B");
                break;
            default:
                System.out.println("char is not A or B");
                break;
        }
        System.out.print("\nenum element = "+myEnum+"\nswitch result: ");
        switch (myEnum) {
            case ONE:
                System.out.println("Enum is ONE");
                break;
            case TWO:
                System.out.println("Enum is TWO");
                break;
            default:
                System.out.println("Enum is not ONE or TWO");
                break;
        }
        System.out.print("\nbyte = "+x+"\nswitch result: ");
        switch (x) {
            case 1:
                System.out.println("byte is 1");
                break;
            case 2:
                System.out.println("byte is 2");
                break;
            default:
                System.out.println("byte is not 1 or 2");
                break;
        }

        System.out.print("\nString = "+day+"\nswitch result: ");
        switch (day) {
            case "Monday":
                System.out.println("Today is Monday");
                break;
            case "Thursday":
                System.out.println("Today is Thursday");
                break;
            default:
                System.out.println("Today is no Monday or Thursday");
        }

    }
}
enum MyEnum {
    ONE, TWO
}

