package recursion;

public class ProductofDigits {
    public static void main(String[] args) {
        int n=12345;
        System.out.println(productOfDigits(n));
    }

    public static int productOfDigits(int n)
    {
        if(n<=0)
        {
            return 1;
        }
        return (n%10)*productOfDigits(n/10);
    }
}
