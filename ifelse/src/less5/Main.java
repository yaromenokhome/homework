package less5;

public class Main {
    public static void main(String[] args) {
        Boolean x = false;
        Boolean y = true;
        Boolean z = true;
        Boolean d1 = x | y & !z;
        Boolean d2 = !(x & z) | y;
        Boolean d3 = x & (!x & !y);
        System.out.println(d1 + "  " + d2 + "  " + d3);

    }
}
