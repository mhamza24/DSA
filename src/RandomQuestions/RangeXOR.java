package RandomQuestions;

public class RangeXOR {
    public static void main(String[] args) {
        // System.out.println(XORIinRange(4));

        // in range
        int a = 3, b = 7; // here it is XOR of 0 to n not n
        System.out.println(b);
        System.out.println(a);
        int ans = XORIinRange(b) ^ XORIinRange(a - 1);
        System.out.println(ans);

        // method 2 ,it will give TLE;
        int ans2 = 0;

        for (int i = a; i <= b; i++) {
            ans2 ^= i;
        }
        System.out.println(ans2);
    }

    static int XORIinRange(int a) {
        if (a % 4 == 0) {
            return a;
        }
        if (a % 4 == 1) {
            return 1;
        }
        if (a % 4 == 2) {
            return a + 1;
        }

        return 0;
    }
}
