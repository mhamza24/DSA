package recursion.sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
     int[] arr={4,3,2,1};
     sorting(arr, arr.length,0,0);
     System.out.println(Arrays.toString(arr));
    }

    public static void sorting(int[] arr,int row,int col,int maxIndex)
    {
        if(row==0)
        {
            return;
        }

        if (row>col)
        {
            if(arr[col]>arr[maxIndex])
            {
                sorting(arr, row, ++col, col);
            }
            else {
                sorting(arr, row, ++col, maxIndex);
            }

        }
        else {
            swap(arr,--row,maxIndex);
            sorting(arr, --row, 0, 0);
        }
    }

    public static void swap(int[] arr,int a,int b)
    {
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }

}
