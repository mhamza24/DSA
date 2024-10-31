package recursion.sorting;

import java.util.Arrays;

public class QuickSort
{
    public static void main(String[] args) {
        //int[] arr={5,4,3,2,1};
        int[] arr={7,6,4,5,8,1,2,3,9};
        quickSort(arr,0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    public static void quickSort(int[] nums,int low,int high)
    {
        if(low>=high)
        {
            return;
        }
        int start=low,end=high;
        int mid =start+(end-start)/2;
        int pivot=nums[mid];

        while (start<=end)
        {
            while (nums[start]<pivot)
            {
                start++;
            }
            while (nums[end]>pivot)
            {
                end--;
            }

            if (start<=end)
            {
                swap(nums,start,end);
                start++;
                end--;
            }


        }


        quickSort(nums ,low,end );
        quickSort(nums ,start,high );
    }

    public static void swap(int[] arr,int first,int second)
    {
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;

    }


}
