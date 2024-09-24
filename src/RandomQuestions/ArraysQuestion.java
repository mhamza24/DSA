package RandomQuestions;

import java.util.Arrays;
import java.util.Scanner;

import static java.util.Collections.swap;

public class ArraysQuestion {
    public static void main(String[] args) {
        int[] arr =new int[6];
        Scanner box=new Scanner(System.in);

        for (int i=0;i< arr.length;i++)
        {
            System.out.print("Enter no :");
            arr[i]=box.nextInt();
        }

//        for (int i :arr)
//        {
//            System.out.print("Before Swap:");
//            System.out.println(arr[i]);
//        }
        System.out.print("Before Swap:");
        System.out.println(Arrays.toString(arr));

        reverse(arr);
//        for (int i :arr)
//        {
//            System.out.print("After Swap:");
//            System.out.println(arr[i]);
//        }
        System.out.print("After Swap:");
        System.out.println(Arrays.toString(arr));



    }
    static int reverse(int[] arr)
    {
        int start=0,end=arr.length-1;

        while (start<end)
        {
            swap(arr,start,end);
            start++;
            end--;
        }
        return 0;
    }

         static void swap(int[] arr,int a,int b) {
    //        int temp=arr[a];
    //        arr[a]=arr[b];
    //        arr[b]=temp;
            arr[a]=arr[a]+arr[b];
            arr[b]=arr[a]-arr[b];
            arr[a]=arr[a]-arr[b];
        }
}
