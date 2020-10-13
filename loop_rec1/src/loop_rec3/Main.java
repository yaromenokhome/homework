package loop_rec3;

import java.util.Scanner;

public class Main {
    static Scanner aaa = new Scanner(System.in);
    public static int b(double a){
        if (a == 1){
            return 1;
        }
        else if (a > 1 && a < 2){
            return 0;
        }
        else
            return b(a/2);
    }
    public static void main(String[] args) {
        System.out.println("Введите число ");
        double n = aaa.nextInt();
        if (b(n) ==1) {
            System.out.println("Yes");
        } else{
            System.out.println("No");
        }
    }
}

