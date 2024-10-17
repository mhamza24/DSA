package recursion;

public class Fibonachi {
    public static void main(String[] args) {
        System.out.println("Ans" + " " + fibo(5));
    }

    static int fibo(int n) {

        if (n < 2) {
            return n;
        }
        System.out.println(n);
        return fibo(n - 1) + fibo(n - 2);

    }
}
