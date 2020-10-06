package line1;

import java.util.Scanner;

public class lesson_21_09 {
    static Scanner aaa = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Введите двузначное число");
        int bbb = aaa.nextInt();
        System.out.println(bbb/10);
        System.out.println(bbb%10);
        System.out.println((bbb/10)*(bbb%10));
        System.out.println((bbb/10)+(bbb%10));

    }

}
