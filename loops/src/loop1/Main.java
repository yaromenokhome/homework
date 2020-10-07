package loop1;

import java.util.Scanner;

public class Main {
    static Scanner aaa = new Scanner(System.in);
    public static void main(String[] args) {
        //вывод таблицы умножения через while
      /*  System.out.println("Введите параметр таблицы умножения ");
        int a = aaa.nextInt();
        int n = 1;
        while (n<=10){
            System.out.println(a + " * " + n + " = " + a*n);
            n++;
        } */
        //вывод таблицы умножения через Do
       /*   System.out.println("Введите параметр таблицы умножения ");
        int b = aaa.nextInt();
        int e = 1;
        do {
            System.out.println(b + " * " + e + " = " + b * e);
            e++;
        } while (e<=10); */
       //вывод таблицы умноржения через For
        System.out.println("Введите параметр таблицы умножения ");
        int t = aaa.nextInt();
        int i;
        for (i = 0; i <= 10; i++) {
            System.out.println(t + " * " + i + " = " + t * i);
        }
    }


}
