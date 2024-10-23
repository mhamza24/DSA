package recursion;

public class Palindrom {
    public static void main(String[] args) {
        int n=12321;
        System.out.println(checkPalindrom(n));

    }

    public static boolean checkPalindrom(int n)
    {
        return n==reverse(n);
    }


    public  static  int  reverse(int n)
    {
        int digits= (int) (Math.log10(n)+1);
        return reverseHelper(n,digits);
    }

    public static int reverseHelper(int n, int digits) {
        if(n%10==n)
        {
            return n;
        }

        return (n%10)*(int)Math.pow(10,digits-1)+reverseHelper(n/10,digits-1);
    }


}
