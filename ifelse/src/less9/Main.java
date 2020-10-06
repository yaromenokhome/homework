package less9;

import java.util.Scanner;

public class Main {
    static Scanner aaa = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Введите целое число");
        int a = aaa.nextInt();
        String e;
        switch (a){
            case 0: e = "zero";
            break;
            case 1: e = "one";
            break;
            case 2: e = "two";
            break;
            case 3: e = "three";
            break;
            case 4: e = "four";
            break;
            case 5: e = "five";
            break;
            case 6: e = "six";
            break;
            case 7: e = "seven";
            break;
            case 8: e = "eight";
            break;
            case 9: e = "nine";
            break;
            default:
                e = "Ошибка ввода";
        }
        System.out.println(e);
    }
}
