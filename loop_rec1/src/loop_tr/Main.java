package loop_tr;

public class Main {
    public static void main(String[] args) {
        //первый треугольник от 10ти до 1го
        for (int i = 0; i < 10; i++) {
            //**********
            for (int j = i; j < 10; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        //второй треугольник от 1го до 10ти
        for (int i = 10; i > 0; i--) {

            for (int j = i; j < 10; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        //третий треугольник
        for (int i = 0; i < 10; i++) {
            for (int j = i; j < 10; j++) {
                System.out.print("  ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        //1
        for (int i = 10; i > 0; i--) {

            for (int j = i; j < 10; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
            for (int i = 0; i < 10; i++) {

            for (int j = i; j < 10; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
            //2
        for (int i = 10; i > 0; i--) {

            for (int j = i; j < 10; j++) {
                System.out.print("  ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        //5
        for (int i = 0; i < 8; i++) {
            for (int j = i; j < 10; j++) {
                System.out.print("   ");
            }
                for (int j = 0; j < i; j++) {
                    System.out.print("*  ");
                }
            for (int j = 1; j < i; j++) {
                System.out.print("*  ");
            }
                System.out.println();
            }

        for (int i = 0; i < 10; i++) {
            for (int j = i; j < 10; j++) {
                System.out.print("   ");
            }
            for (int j = 0; j < i; j++) {
                    System.out.print("*  ");
                }
            for (int j = 1; j < i; j++) {
                System.out.print("*  ");
            }
                System.out.println();

            }
        //4
        for (int i = 0; i < 10; i++) {
            for (int j = i; j < 10; j++) {
                System.out.print("  ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = 10; i > 0; i--) {

            for (int j = i; j < 10; j++) {
                System.out.print("  ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

            }
    }


