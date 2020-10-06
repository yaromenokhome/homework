package less10;

import java.util.Scanner;

public class Main {
    static Scanner aaa = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Введите номер дня недели");
        int a = aaa.nextInt();
        String e;
        switch (a){
            case 1: e = "Понедельник";
                break;
            case 2: e = "Вторник";
                break;
            case 3: e = "Среда";
                break;
            case 4: e = "Четверг";
                break;
            case 5: e = "Пятница";
                break;
            case 6: e = "Суббота";
                break;
            case 7: e = "Воскресенье";
                break;
            default:
                e = "Нет такого";
        }
        System.out.println(e);
    }
}

