package RandomQuestions;


public class NumberOccurences {

    public static void main(String[] args) {
        long a = 1385757879L,b;
        int count=0;
        while (a>0)
        {
            b=a%10;
            System.out.println(a);
            System.out.println(b);
            if(b==7)
            {
                count++;
            }
            a=a/10;

        }

        System.out.println("7 is occurring : "+count+" times");

    }
}
