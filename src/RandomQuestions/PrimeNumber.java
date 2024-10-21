package RandomQuestions;

public class PrimeNumber {
    public static void main(String[] args) {
        int n = 36;
        boolean[] primes = new boolean[n + 1];
        // System.out.println(PrimenoCheck(n));
        PrimenoCheck_sieve(n, primes);

    }

    public static boolean PrimenoCheck(int n) {
        boolean isPrime = false;

        // loop conidtion can be (i*i<=n)

        for (int i = 2; i < Math.sqrt(n); i++) {
            if (n % i == 0) {

                return isPrime;
            }
        }

        return isPrime = true;
    }

    public static void PrimenoCheck_sieve(int n, boolean[] primes) {
        for (int i = 2; i * i <= n; i++) {
            if (!primes[i]) {
                for (int j = i * 2; j <= n; j += i) {
                    System.out.println(j);
                    primes[j] = true;
                }
            }
        }

        for (int i = 2; i <= n; i++) {
            if (!primes[i]) {
                System.out.print(i + " ");
            }
        }
    }
}
