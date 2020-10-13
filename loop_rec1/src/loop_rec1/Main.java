package loop_rec1;

public class  Main {
    public static String aaa(int n){
       if (n==1){
            return "1";
        }
        return aaa( n-1) + " " + n;
    }

    public static int fact (int a) {
        if (a==1) {
        return 1;
    }
       return fact (a - 1)*a;
    }


    public static void main(String[] args) {
        System.out.println("Вывод чисел методом рекурсия  ");
        System.out.println(aaa(12));
        System.out.println(" Вычисление факториала методов рекурсии ");
        System.out.println(fact(9));
    }

}
