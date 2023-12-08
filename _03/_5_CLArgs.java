package _03;

public class _5_CLArgs {
    public static void main(String[] args) {
        //Проверяем, есть ли аргументы командной строки
        if (args.length == 0) {
            System.out.println("Аргументы командной строки отсутствуют.");
        } else {
            System.out.println("Аргументы командной строки:");

            // Выводим каждый аргумент на экран
            for (int i = 0; i < args.length; i++) {
                System.out.println(args[i]);
            }
        }
    }
}
//Можно запустить из командной строки. Например:
    //*путь к файлу* _5_CLArgs arg1 arg2 arg3

//Вывод:
    //Аргументы командной строки:
    //arg1
    //arg2
    //arg3


