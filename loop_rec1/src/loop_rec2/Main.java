package loop_rec2;

import java.util.Scanner;

public class Main {
    static Scanner aaa = new Scanner(System.in);
    public static int b(int a){
        if (a<10){
            return a;
        }
        return a%10 + b(a/10);
    }
    public static void main(String[] args) {

        System.out.println("Введите число ");
        int n = aaa.nextInt();
        System.out.println(b(n));
    }
}
