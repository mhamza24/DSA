package recursion.sorting;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr={5,4,3,2,1};
        System.out.println(Arrays.toString(mergeSort(arr)));

    }

    public static int[] mergeSort(int[] arr)
    {
        if(arr.length==1)
        {
            return arr;

        }

        int mid= arr.length/2;
        int[] left =mergeSort(Arrays.copyOfRange(arr,0,mid));
        int[] right =mergeSort(Arrays.copyOfRange(arr,mid,arr.length));
        return merging(left,right);

    }

    public static int[] merging(int[] left, int[] right) {
        int[] merged=new  int[left.length+right.length];
        int i=0,j=0,k=0;

        while (i<left.length && j<right.length)
        {
            if(left[i]<right[j])
            {
                merged[k++]=left[i++];
            }
            else{
                merged[k++]=right[j++];
            }

        }

        while (i<left.length)
        {
            merged[k++]=left[i++];
        }

        while (j<right.length)
        {
            merged[k++]=left[j++];
        }

        return merged;


    }

    public static class InplaceMergeSort{
        public static void main(String[] args) {
            int[] arr={5,4,3,2,1};
            mergeSort(arr,0, arr.length);
            System.out.println(Arrays.toString(arr));
        }


        public static void  mergeSort(int[] arr,int start,int end)
        {
            if(end-start==1)
            {
                return;

            }

            int mid= start+(end-start)/2;
            mergeSort(arr,start,mid);
            mergeSort(arr,mid,end);
            merging(arr,start,end,mid);

        }

        private static void merging(int[] arr, int start, int end, int mid) {
            int[] merged=new  int[end-start];
            int i=start,j=mid,k=0;

            while (i<mid && j<end)
            {
                if(arr[i]<arr[j])
                {
                    merged[k++]=arr[i++];
                }
                else{
                    merged[k++]=arr[j++];
                }

            }

            while (i<mid)
            {
                merged[k++]=arr[i++];
            }

            while (j<end)
            {
                merged[k++]=arr[j++];
            }
            for (int l = 0; l < merged.length; l++) {
                arr[start+l]=merged[l];
            }


        }







    }

}
