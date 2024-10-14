package sorting.SlectionSort;

import java.util.Arrays;

public class SlectionSort {
    public static void main(String[] args) {
        int[] arr={5,4,3,2,1};
        sorting(arr);
        System.out.println(Arrays.toString(arr));


    }


    public static void sorting(int[] arr)
    {
        for (int i=0;i<arr.length;i++)
        {
            int last=arr.length-1-i;
            int maxIndex=getMaxIndex(arr,0,last);
            swapArrayValues(arr,maxIndex,last);
        }
    }

    public static void swapArrayValues(int[] arr,int first,int second)
    {
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }


    private static int getMaxIndex(int[] arr, int start, int last) {
        int max=start;
        for (int i=start;i<=last;i++)
        {
            if(arr[max]<arr[i])
            {
                max=i;
            }
        }
        return max;
    }

}
