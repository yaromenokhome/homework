package less11;

import java.util.Scanner;

public class Main {
    static Scanner aaa = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Введите номер месяца");
        int a = aaa.nextInt();
        String e;
        switch (a){
            case 1: e = "31";
                break;
            case 2: e = "28, но по весокосным - 29";
                break;
            case 3: e = "31";
                break;
            case 4: e = "30";
                break;
            case 5: e = "31";
                break;
            case 6: e = "30";
                break;
            case 7: e = "31";
                break;
            case 8: e = "30";
                break;
            case 9: e = "30";
                break;
            case 10: e = "31";
                break;
            case 11: e = "30";
                break;
            case 12: e = "31";
                break;
            default:
                e = "Ошибка ввода";
        }
        System.out.println(e);
    }
}
