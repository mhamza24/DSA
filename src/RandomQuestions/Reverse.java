package RandomQuestions;
public class Reverse {



    public static void main(String[] args) {
        int a =5148284,b=0,c=0;
        while(a>0){
            c = a % 10;
            b = ( b * 10 ) + c;
            a = a / 10;
        }
        System.out.println("reverse order: "+b);


    }


}
