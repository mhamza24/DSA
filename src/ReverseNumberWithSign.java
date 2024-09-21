public class ReverseNumberWithSign {
    public static void main(String[] args) {
        int num=-321;
        int ans=0;
        int sign;

        if(num<0)
        {
            sign=-1;
            num=num*sign;
        }
        else {
            sign=1;
        }
        while (num>0)
        {
           int rem=num%10;
            ans=(ans*10)+rem;
           num= num/10;

        }


        System.out.println(ans*sign);


    }
}
