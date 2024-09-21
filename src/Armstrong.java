public class Armstrong {
    public static void main(String[] args) {

        int n=153,a=0,sum=0,noToBeChecked=n;
        while(n>0)
        {
           a =n%10;
           sum+=a*a*a;
           n/=10;
        }

        if (sum==noToBeChecked)
        {
            System.out.println("No is Armstrong");
        }
        else {
            System.out.println("No is not Armstrong");
        }
    }
}
