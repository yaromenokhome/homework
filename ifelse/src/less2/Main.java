package less2;

import java.util.Scanner;

public class Main {
    static Scanner aaa = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Введите два числа ");
        int a = aaa.nextInt();
        int b = aaa.nextInt();
        Boolean c = a > b;
        System.out.println(c);

    }
}

