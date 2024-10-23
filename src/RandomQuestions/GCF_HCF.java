package RandomQuestions;

public class GCF_HCF {
    public static void main(String[] args) {
        System.out.println(hcfWithEucliden(4,8));
    }
//Eucliden Algorithim
    public  static  int hcfWithEucliden(int a,int b)
    {

        if(a==0)
        {
            return b;
        }
        return hcfWithEucliden(a%b,a);
    }

}
