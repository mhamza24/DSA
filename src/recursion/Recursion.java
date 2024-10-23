package recursion;

public class Recursion {
    public static void main(String[] args) {
        message(1);
    }

    static void message(int n) {
        if (n  > 5) {
            return;
        }
        System.out.println(n);
        message(n + 1);
    }

    static void messageReverse(int n) {
        if (n  > 5) {
            return;
        }
        message(n + 1);
        System.out.println(n);
    }

}
