package sorting.InsertionSort;

import java.util.Arrays;

public class InsertionSort
{
    public static void main(String[] args) {
        int[] arr={5,4,3,2,1};
        sorting(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void sorting(int[] arr)
    {
        for (int i=0;i<arr.length-1;i++)
        {
            for (int j=i+1;j>0;j--)
            {
                if(arr[j]<arr[j-1])
                {
                    System.out.println(j+"  "+(j-1) +"  i:"+i);
                    swapArrayValues(arr,j,j-1);
                }
                else {
                    break;
                }
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
