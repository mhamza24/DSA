package RandomQuestions;

import java.util.ArrayList;

public class ArraysList
{
    public static void main(String[] args) {
        final int[]  rollnos=new int[5];
        rollnos[0]=15;
        rollnos[1]=25;
        rollnos[2]=35;
        rollnos[3]=45;
        rollnos[4]=55;

        for(int rollno : rollnos)
        {
            System.out.println(rollno);
        }
        System.out.println();

        test(rollnos);
        for(int rollno : rollnos)
        {
            System.out.println(rollno);
        }
        String a= null;

        String[] strTest=new String[5];
        strTest[0]="MHK";
        strTest[1]="KMH";
        strTest[2]="M";
        strTest[3]="H";
        strTest[4]="MHK";


        for(String str:strTest)
        {

            System.out.println(str+" "+str.hashCode());

        }


        ArrayList<Integer> arraysList1 = new ArrayList<Integer>(5);
        arraysList1.add(5);
        System.out.println(arraysList1.hashCode());
        arraysList1.add(4);
        System.out.println(arraysList1.hashCode());
        arraysList1.add(4);
        System.out.println(arraysList1.hashCode());
        arraysList1.add(4);
        System.out.println(arraysList1.hashCode());
        arraysList1.add(4);
        System.out.println((arraysList1.hashCode()));



    }

    static  void test(int[] arr)
    {
        arr[0]=24;
    }

}
