package loop_del;

import java.util.Scanner;

public class Main {
    static Scanner aaa = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Введите произвольное число ");
        int a = aaa.nextInt(); // само число
        int b = 1; // счетчик цикла
        int c = 0; // количество делителей
        while (b <= a){
            int r = a%b ;
            if (r == 0){
                c+=1;
            }
            b+=1;
        }
        System.out.println("Число имеет " + c +" делителей");
        if (c ==2){
            System.out.println("Число простое ");
        } else {
            System.out.println("Число составное ");
        }
    }
}
