package less3;

import java.util.Scanner;

import static java.lang.StrictMath.sqrt;

public class Main {
    static Scanner aaa = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Введите a, b и c ");
        int a = aaa.nextInt();
        int b = aaa.nextInt();
        int c = aaa.nextInt();
        int d = b*b - 4*a*c;
        Boolean ddd = d<0;
        if (ddd){
            System.out.println("Нет корней ");
        }
        else{
            System.out.println("Корни есть ");
            double x1 = ((b*(-1)) - sqrt(d))/(2*a);
            double x2 = ((b*(-1)) + sqrt(d))/(2*a);
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        }

    }
}