package recursion;

public class SumofDigits {
    public static void main(String[] args) {
        int a =12345;

        System.out.println(sumOfDigits(a));
    }

    public static int sumOfDigits(int n)
    {
        if(n<=0)
        {
            return 0;
        }
        return (n%10)+sumOfDigits(n/10);
    }



}
