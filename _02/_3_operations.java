package _02;

public class _3_operations {
    public static void main(String[] args) {
        //ЛОГИЧЕСКИЕ ОПЕРАЦИИ
        System.out.println("ЛОГИЧЕСКИЕ ОПЕРАЦИИ:");
        //Условное И - && (конъюкция)
        //Можно так же использовать логичское И - &,
        //но условное работает быстрее, а результат тот же
        boolean a = true;
        boolean b = false;
        boolean c = true;
        System.out.println("Условное И:");
        System.out.print(a+" & "+b+" = ");
        System.out.println(a & b);
        System.out.print(a+" & "+c+" = ");
        System.out.println(a & c);
        //Можно использовать не только логические типы, но смысл тот же
        System.out.print("(3 > 1) & (2 > 5) = ");
        System.out.println((3 > 1) & (2 > 5)); // true * false = false
        System.out.print("(2 < 5) & (3 > 1) = ");
        System.out.println((2 < 5) & (3 > 1)); // true * true  = true
        //Можно совмещать типы данных
        System.out.print("(3 > 1) & "+b+" = ");
        System.out.println((3 > 1) & b);// true * false = false

        //Условное ИЛИ - ||
        //Логическое ИЛИ - |, ведет себя так же как и логическое И - &
        System.out.println("Условное ИЛИ:");
        System.out.print(a+" || "+b+" = ");
        System.out.println(a || b); // true + false = true
        System.out.print(a+" || "+c+" = ");
        System.out.println(a || c); // true + true = true
        //Можно использовать не только логические типы, но смысл тот же
        System.out.print("(3 > 1) || (2 > 5) = ");
        System.out.println((3 > 1) || (2 > 5)); // true + false = true
        //Можно совмещать типы данных
        System.out.print("(3 > 1) || "+b+" = ");
        System.out.println((3 > 1) || b);// true + false = true
        //Ну и для примера хотя бы одного отрицания
        System.out.print("(3 < 1) || "+b+" = ");
        System.out.println((3 < 1) || b);// false + false = false

        //Операция логического отрицания - !
        System.out.println("Логическое отрицание:");
        System.out.print("!"+a+" = ");
        System.out.println(!a); // a = true => !a = false
        System.out.print("!"+b+" = ");
        System.out.println(!b); // b = false => !b = true
        System.out.print("!(2 > 3) = ");
        System.out.println(!(2 > 3));// 2 > 3 = false => !(2 > 3) = false

        //Совместим все операции
        System.out.println("Три опреации сразу:");
        System.out.print("!"+b+" && ((2 > 3) || (5 > 2)) = ");
        System.out.println(!b && ((2 > 3) || (5 > 2)));
        // b = false => !b = true
        // 2 > 3 = false, 5 > 2 = true => false + true = true
        // true * true = true

        // ТЕРНАРНАЯ ОПЕРАЦИЯ
        // Синтаксис:  [первый операнд - условие] ? [второй операнд] : [третий операнд]
        // В зависимости от условия тернарная операция возвращает второй или третий операнд:
        // если условие равно true - второй операнд
        // если условие равно false - третий
        int x = 2;
        int y = 3;
        System.out.println("\nТЕРНАРНЫЙ ОПЕРАТОР:");
        System.out.print(x+" < "+y+" ? ("+x+" + "+y+") : ("+x+" - "+y+") = ");
        System.out.println(x < y ? (x + y) : (x - y));
        //x < y: 2 < 3 = true => выполняется второй операнд
        //x + y: 2 + 3 = 5 => выведет: 5
        System.out.print(x+" == "+y+" ? ("+x+" + "+y+") : ("+x+" - "+y+") = ");
        System.out.println(x == y ? (x + y) : (x - y));
        //x == y: 2 == 3 = false => выполняется третий операнд
        //x - y: 2 - 3 = -1 => выведет: -1

        // ПОРАЗРЯДНЫЕ ЛОГИЧЕСКИЕ ОПЕРАЦИИ
        //Операторы употребляются к целочисленным типам данных
        //Один разряд - один бит
        //из десятичных переводят в двоичные
        int e = 25;
        int f = 112;
        System.out.println("\nПОДРАЗРЯДНЫЕ ОПЕРАТОРЫ:");
        int res1 = e & f; //16
        System.out.println(e + " & " + f + " = " + res1);
        //25 = 11001
        //112 = 1110000
        // 0011001
        //&
        // 1110000
        //=
        // 0010000 = 16
        int res2 = e | f; //16
        System.out.println(e + " | " + f + " = " + res2);
        // 0011001
        //|
        // 1110000
        //=
        // 1111001 = 121
        int res3 = e ^ f; //16
        System.out.println(e + " ^ " + f + " = " + res3);
        // 0011001
        //^
        // 1110000
        //=
        // 1101001 = 105
        int res4 = ~e;
        // ~0011001 = 1100110 = -26
        System.out.println("~" + e + " = " + res4);

        //ОПЕРАЦИИ СДВИГА
        System.out.println("\nОПЕРАЦИИ СДВИГА:");

        //Побитовый сдвиг влево
        int g = -13;
        int result1 = g<<1;
        System.out.println("Побитовый сдвиг влево:");
        System.out.println(g+ " = "+ Integer.toBinaryString(g));
        System.out.println(g+ " << 1 = "+Integer.toBinaryString(result1)+ " = "+result1);

        //Побитовый сдвиг вправо
        int result2 = g>>2;
        System.out.println("Побитовый сдвиг вправо:");
        System.out.println(g+ " = "+ Integer.toBinaryString(g));
        System.out.println(g+ " >> 2 = "+Integer.toBinaryString(result2)+" = "+result2);

        int result3 = g>>>3;
        System.out.println("Побитовый сдвиг вправо без сохранения знака:");
        System.out.println(g+ " = "+ Integer.toBinaryString(g));
        System.out.println(g+ " >>> 3 = "+Integer.toBinaryString(result3)+ " = "+result3);
    }

}
