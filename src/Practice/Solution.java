package Practice;

import java.util.Arrays;

//here we will solve each question and then add that as a string in enum class
public class Solution
{
    public static void main(String[] args) {
//        int[] arr={1,2,3,4,5,3,1,6};
        int[] arr={4,5,6,7,0,1,2};
        int[] arr2={3,1};
        System.out.println(findElementWith(arr2,1));
    }

//    public int search(int[] nums, int target) {
//
//    }

    public static int findElementWith(int[] arr,int target)
    {
        int peek=findMountainPeek(arr);
        if(peek==-1)
        {
            return  findElementBinarySearch(arr,target,0,arr.length-1);
        }
        if(arr[peek]==target)
        {
            return peek;
        }

        if(target>=arr[0])
        {
            return findElementBinarySearch(arr,target,0,peek-1);
        }
        {
            return findElementBinarySearch(arr,target,peek+1,arr.length-1);
        }


    }
    public  static int  findMountainPeek(int[] arr)
    {
        int start=0,end= arr.length-1;
        while (start<end)
        {
            int mid=start+(end-start)/2;

            if ( mid<end &&  arr[mid+1]<arr[mid]   )
            {
               return mid;
            }
            else if(mid>start && arr[mid-1]>arr[mid] )
            {
                return mid-1;
            }
            else if(arr[start]>=arr[mid])
            {
                end=mid-1;
            }
            else if(arr[start]<=arr[mid]){
                start=mid+1;
            }

        }
        return -1;
    }

    public  static int findElementBinarySearch(int[] arr,int target,int start,int end)
    {

        while (start<=end)
        {
            int mid=start+(end-start)/2;
            if (arr[mid]==target)
            {
                return mid;
            }
            if(arr[mid]>target)
            {
                end=mid-1;
            }
            else if(arr[mid]<target)
            {
                start=mid+1;
            }
        }
        return -1;
    }











}
