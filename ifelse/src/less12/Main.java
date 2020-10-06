package less12;

import java.util.Scanner;

public class Main {
    static Scanner aaa = new Scanner(System.in);
    public static void main(String[] args) {
        int x1 = 2;
        int y1 = 6;
        int x2 = 6;
        int y2 = 4;

        int x3 = 10;
        int y3 = 10;
        int x4 = 18;
        int y4 = 1;

        System.out.println("Введите координаты точки   ");
        int x = aaa.nextInt();
        int y = aaa.nextInt();
        Boolean p1 = x > x1 & x < x2 & y > y2 & y < y1;
        if (p1){
            System.out.println("Точка принадлежит прямоугольнику p1 ");
        }else{
            System.out.println("Точка не принадлежит прямоугольнику p1 ");
        }
        Boolean p2 = x > x3 & x < x4 & y > y4 & y < y3;
        if (p2){
            System.out.println("Точка принадлежит прямоугольнику p2 ");
        }else{
            System.out.println("Точка не принадлежит прямоугольнику p2 ");
        }
        
    }

}
