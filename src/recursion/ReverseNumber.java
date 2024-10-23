package recursion;

public class ReverseNumber {
    static int sum=0;
    public static void main(String[] args) {
       int n=12345;
       //reverse1(n);
        System.out.println(reverse2(n));
        System.out.println(4%10);


    }
    public  static  void reverse1(int n)
    {
        if(n==0)
        {
            return;
        }
        sum=(n%10)+(sum*10);
        reverse1(n/10);
    }



    public  static  int  reverse2(int n)
    {
        int digits= (int) (Math.log10(n)+1);
        return reverse2Helper(n,digits);
    }

    public static int reverse2Helper(int n, int digits) {
        if(n%10==n)
        {
            return n;
        }

        return (n%10)*(int)Math.pow(10,digits-1)+reverse2Helper(n/10,digits-1);
    }


//    public  static  int  reverse2(int n)
//    {
//        if(n==0)
//        {
//            return 0;
//        }
//
//        return ((n%10))+reverse2(n/10);
//    }

}
