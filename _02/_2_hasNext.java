package _02;

import java.util.Scanner;

public class _2_hasNext {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;
        for (; scanner.hasNext(); ) {
            input = scanner.next();
            System.out.print(input + " ");
        }
    }
}
