package RandomQuestions;

import java.util.ArrayList;

public class Factors {
    public static void main(String[] args) {
        int n=20;
       // factors(n);
        //factors1(n);
        factors3(n);
    }

    //O(n)
    public  static void factors(int n)
    {
        for (int i = 1; i <= n; i++) {
            if(n%i==0)
            {
                System.out.print(i+" ");
            }

        }
    }


    public  static void factors1(int n)
    {
        for (int i = 1; i*i <= n; i++) {
            if(n/i==i){

                    System.out.print(i+" ");

            }
            else {
                System.out.print(i+" "+n/i+" ");
            }

        }
    }

    //space and time will be O(sqrt(n))
    //we can store this in array and then apply cycle sort
    public  static void factors3(int n)
    {
        ArrayList<Integer> factors=new ArrayList<>(n);
        for (int i = 1; i*i <= n; i++) {
            if(n/i==i){

                System.out.print(i+" ");

            }
            else {

                System.out.print(i+" ");
                factors.add(n/i);
            }


        }
//        System.out.println(factors);
//        System.out.print("Size: "+factors.size());
        for (int j = factors.size()-1; j >=0 ; j--) {

            System.out.print(factors.get(j)+" ");
        }


    }


}
