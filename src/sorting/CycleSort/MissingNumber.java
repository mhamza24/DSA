package sorting.CycleSort;

import java.util.Arrays;

//Amazon
public class MissingNumber
{


    public static void main(String[] args) {
        int[] arr={3,0,1};
        missingNumber(arr);
        System.out.println( missingNumber(arr));

    }

    public static int missingNumber(int[] nums) {
        sorting(nums);
        return findingNumber(nums);
    }
    public static int findingNumber(int[] arr)
    {
        for (int i=0;i<arr.length;i++)
        {
            if(arr[i]!=i)
            {
                return i;
            }
        }
        return arr.length;
    }


    public static void sorting(int[] arr)
    {
        int i=0;
        while (i<arr.length)
        {
            int correctIndex=arr[i];

            if(arr[i]<arr.length && arr[i]!=arr[correctIndex])
            {
                swapArrayValues(arr,i,correctIndex);
            }
            else {
                i++;
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
