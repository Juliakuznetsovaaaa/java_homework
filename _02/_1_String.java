package _02;

public class _1_String {
    public static void main(String[] args) {
        //Сложение строк
        String hello = "Hello";
        String world = "world";
        System.out.println(hello + " " + world); //результат: Hello world

        //Сравнение строк
        System.out.println("Hello".equals(hello));//true
        //Сравнение строк без учета регистра
        System.out.println("HELLO".equalsIgnoreCase(hello));//true

        //применение любого примитивного типа данных к строке
        //рассмотрим float и boolean, остальные аналогично
        System.out.println(String.valueOf(0.123F));//0.123
        System.out.println(String.valueOf(false));//false

        //перевод строки в число
        System.out.println(Integer.parseInt("1"));//1
        System.out.println(Double.parseDouble("0.1D"));//0.1

        //Разбиение строки на массивы
        String[] lettersArray = "A; B; C; D; ".split("; ");
        for (String letter : lettersArray) {
            System.out.println(letter);
            /*A
              B
              C
              D*/
        }

        //Поиск позиции в строке
        System.out.println("ABCDEFG".indexOf('A'));//0

        //Изменение регистра
        System.out.println("AbCdEfG".toLowerCase());//abcdefg
        System.out.println("AbCdEfG".toUpperCase());//ABCDEFG


        //Работа с классом StringBuilder
        // так же существует аналогичный ему класс StringBuffer, но у второго еще есть потокобезопасность

        StringBuilder alphabet = new StringBuilder("abcdef");

        //Приведение элемента StringBuilder к String
        String alphabetString = alphabet.toString();

        //Добавление элемента в конец
        System.out.println(alphabet.append("g"));//было: abcdef, стало:abcdefg

        //Добавление элемента по индексу
        System.out.println(alphabet.insert(3, "U"));//было: abcdefg, стало:abcUdefg

        //Удаление элемента строки по индексу
        System.out.println(alphabet.deleteCharAt(1));//было: abcUdefg, стало: acUdefg

        //Удаление части строки с одной позиции до другой
        System.out.println(alphabet.delete(0, 3));//было: acUdefg, стало: defg

        //Замена части строки на другу
        //.replace(start int, end int, new String)
        System.out.println(alphabet.replace(1, 3, " it's not alphabet :( "));//было: defg, стало: d it's not alphabet :( g

        //Разворот строки
        System.out.println(alphabet.reverse());//было: d it's not alphabet :( g, стало: g (: tebahpla ton s'ti d

        //Обрезка строки
        //с начала до опреленного символа
        System.out.println(alphabet.substring(5));//было: g (: tebahpla ton s'ti d, стало: tebahpla ton s'ti d
        //с одного идекса до другого
        System.out.println(alphabet.substring(2, 4));//было: g (: tebahpla ton s'ti d, стало: (:
    }

}