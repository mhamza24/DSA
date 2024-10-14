package sorting.CycleSort;

import java.util.Arrays;
//Amazon
public class CycleSort
{
    public static void main(String[] args) {
        int[] arr={5,4,3,2,1};
        sorting(arr);
        System.out.println(Arrays.toString(arr));
    }


    public static void sorting(int[] arr)
    {
        int i=0;
        while ( i<arr.length)
        {
            int correctIndex=arr[i]-1;

            if(arr[i]!=arr[correctIndex]){
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
