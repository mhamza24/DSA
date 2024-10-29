package recursion.sorting;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
        int[] arr={4,3,2,1};
        sorting(arr, arr.length-1, 0);
        System.out.println(Arrays.toString(arr));

    }

    public static void sorting(int[] arr,int row,int col)
    {
        if(row== 0)
        {
            return;
        }

        if(row>col)
        {
            System.out.print("* ");
            if(arr[col]>arr[col+1])
            {
                swap(arr,col,col+1);
            }
            sorting(arr,row,++col);

        }
        else {
            System.out.println();
            sorting(arr,--row,0);
        }
    }

    public static void swap(int[] arr,int a,int b)
    {
        int temp=arr[a];
        arr[a]=b;
        arr[b]=temp;
    }






//     public static void sorting(int[] arr,int index)
//    {
//        if(index==arr.length)
//        {
//            return;
//        }
//
//        if(index-1>0)
//        {
//            if(arr[index]<arr[index-1])
//            {
//                System.out.println(1);
//                int temp =arr[index];
//                 arr[index]=arr[index-1];
//                 arr[index-1]=temp;
//
//            }
//        }
//        sorting(arr,++index);
//
//    }

}
