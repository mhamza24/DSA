package RandomQuestions;

public class NewtonsSqRt {

    //newtons method 1/2*(x +n/x),where x is the guess no
    public static void main(String[] args) {
        System.out.println(sqrt(40));
        System.out.println(0.5*(40+(40/40)));
    }

    static  double sqrt(double n) {
        double x = n;
        double root;

        while (true) {
            root = 0.5 * (x + (n / x));


            if (Math.abs(root-x) < 0.5) {
                break;
            }
            x = root;


        }
        return root;
    }


}
