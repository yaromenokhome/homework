package array_vv;


import javafx.css.Match;

import java.util.Scanner;

public class Main {
    static Scanner aaa = new Scanner(System.in);
    public static void main(String[] args) {
        int [] arr1;
        double arr2 [];
        String [] arr3;
        int arr4 [] = { 45 , 23, 67, 100};
        int n = 3;
        int a1, a2;
        String a3;
        arr1 = new int[n];
        arr2 = new double[n];
        arr3 = new String[n];
        //ввод с клавиатуры
        for (int i = 0; i < n; i++) {
            System.out.println("Введите " + (i + 1) + " число");
            a3 = aaa.nextLine();
            arr3 [i] = a3;

        }
        //ввод по формуле
        for (int i = 0; i < n; i++) {
            arr2 [i] = 3.14 *i;

        }
        //ввод случайного числа
        for (int i = 0; i < n; i++) {
            arr1 [i] = (int) Math.floor(Math.random() * 10 );

        }
        for (int i = 0; i < n; i++) {
            System.out.println(arr1[i]);

        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr2[i] + " ");

        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr3[i] + " ");

        }
        System.out.println();
        for (int i = 0; i < n; i++) {
            System.out.println(arr4[i]);

        }
    }
}
