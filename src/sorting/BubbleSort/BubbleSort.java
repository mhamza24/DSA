package sorting.BubbleSort;

import java.util.Arrays;

public class BubbleSort
{
    public static void main(String[] args) {
//        int[] arr={1,8,6,7,1,2,3,474,6,9,1};
        int[] arr={5,4,3,2,1};
       // int[] arr2={1,2,3,4,5};
        sorting(arr);
        System.out.println(Arrays.toString(arr));


    }

    public static void sorting(int[] arr)
    {
       for (int i=0;i< arr.length;i++){
           boolean sorted=false;
           for (int j=1;j<arr.length-i;j++){

               if(arr[j]<arr[j-1])
               {
                   int temp=arr[j-1];
                   arr[j-1]=arr[j];
                   arr[j]=temp;
                   sorted=true;
               }

           }
           if(!sorted){

               break;
           }
       }

    }


}
