package less8;

import java.util.Scanner;

public class Main {
    static Scanner aaa = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Введите целое число");//без сохранения переменной
        int a = aaa.nextInt();
        System.out.println(a % 2 == 0 ? "четное ": "нечетное ");

        System.out.println("Введите целое число"); //с сохранением переменной
        int b = aaa.nextInt();
        String s = b % 2 == 0 ? "четное ": "нечетное ";
        System.out.println(s);
    }
}
