package sorting.CycleSort;

import java.util.ArrayList;
import java.util.List;

public class FindAllNumbersDisappearedInAnArray {
    public static void main(String[] args) {
    int[] arr={4,3,2,7,8,2,3,1};
    sorting(arr);
    findNumbers(arr);
    System.out.println(findNumbers(arr));

    }




    public static  List<Integer> findNumbers(int[] arr)
    {
        int i=0;
        List<Integer> missingNumbers=new ArrayList<Integer>(arr.length);
        while (i<arr.length){
            System.out.println(i);
            if(arr[i]==i+1)
            {

                i++;
            }
            else
            {

                missingNumbers.add(i+1);
                i++;
            }
        }


        return  missingNumbers;

    }


    public static  void sorting(int[] arr)
    {
        int i=0;
        while (i<arr.length)
        {
            //{1,2,3,4,5}
            int correctIndex=arr[i]-1;

            if(arr[i]==arr[correctIndex]){
              i++;
            }
            else {
                swapArrayValues(arr,i,correctIndex);
            }


        }


    }

    public static void swapArrayValues(int[] arr,int first,int second)
    {
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }

}
