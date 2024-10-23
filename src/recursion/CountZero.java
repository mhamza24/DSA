package recursion;

public class CountZero {
    public static void main(String[] args) {
        int n=3020560;
        System.out.println(countZeros(n));
    }
    public  static int countZeros(int n)
    {
        return countZerosHelper(n,0);
    }

    public static int countZerosHelper(int n, int c) {
        if(n==0)
        {
            return c;
        }

        if(n%10==0)
        {
            return countZerosHelper(n/10,++c);
        }
        else {
            return countZerosHelper(n/10,c);
        }

    }

}
