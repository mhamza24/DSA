package BinarySeach;

import java.util.Arrays;

public class ArraySearch_2D {
    public static void main(String[] args) {

        int[][] arr={
                {10,20,30,40},
                {15,25,35,45},
                {28,29,37,49},
                {33,34,38,50}
              };
        System.out.println(arr.length);
        System.out.println(Arrays.toString(Search(arr,
                37)));
    }

    public  static int[]  Search(int[][] arr,int target){
        int r = 0,c = arr.length-1;

        while (r<arr.length && c>=0)
        {
            System.out.println(arr[r][c]);
            if(arr[r][c]==target)
            {
                return new int[]{r,c};
            }

            if(arr[r][c]<target)
            {
                r++;
            }
            else {
                c--;
            }

        }
        return new int[]{-1,-1};

    }

}
