package RandomQuestions;

public class LCM {
    public static void main(String[] args) {
        System.out.println(lcm(9,18));
    }


    public  static  int GCF(int a,int b)
    {

        if(a==0)
        {
            return b;
        }
        return GCF(a%b,a);
    }
    public static int lcm(int a,int b)
    {
        //int gcf=GCF(a,b);
        return (a*b)/GCF(a,b);
    }
}
