package RandomQuestions;

public class EvenOdd {
    public static void main(String[] args) {
        OddEven(9);
    }

    public static void OddEven(int n) {

        //boolean isodd = (n & 1) == 1 ? true : false;
        System.out.println((n & 1) == 1 ? true : false);
    }

}
