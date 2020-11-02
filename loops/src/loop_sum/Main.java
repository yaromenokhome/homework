package loop_sum;

import java.util.Scanner;

public class Main {
    static Scanner aaa = new Scanner(System.in);
    public static void main(String[] args) {
        int S = 0;
        for (int i = 0; i < 5; i++) {
            System.out.println("Введите " + (i++) + " число");
            int a = aaa.nextInt();
            S += a;


        }
        System.out.println("Сумма этих чисел - " + S);
        double n = S / 5;
        System.out.println("Среднее арифметическое этих чисел - " + n);


    }
}
