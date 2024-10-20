package RandomQuestions;

public class Powerof2 {
    public static void main(String[] args) {
        int count = 0;
        int n = 10;

        while (n > 0) {
            int last = (n & 1);
            n = (n >> 1);
            if (last == 1) {
                count++;
            }

        }

        if ((n & (n - 1)) == 0) {
            System.out.println("Powerof2");
        } else {
            System.out.println("!Powerof2");
        }

        if (count == 1) {
            System.out.println("Powerof2");
        } else {
            System.out.println("!Powerof2");
        }
    }

}
