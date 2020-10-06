package less6;

import java.util.Scanner;

public class Main {
    static Scanner aaa = new Scanner(System.in);
    public static void main(String[] args) {
        int x = aaa.nextInt();
        int y = aaa.nextInt();
        Boolean a = x*x + y*y <= 4;
        Boolean b = (x>=0) & (y*y != 0);
        Boolean c = x*y != 0 & y > x;
        System.out.println(a + "  " + b + "  " + c);
    }
}
