package Practice;

import java.util.Arrays;

//here we will solve each question and then add that as a string in enum class
public class Solution
{
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,3,1,6};
        System.out.println(findElementWith(arr,8));
    }

    public static int findElementWith(int[] arr,int target)
    {
        int peek=findMountainPeek(arr);
        int leftside=findElementBinarySearch(arr,target,0,peek);
        if(leftside!=-1)
        {
            return leftside;
        }
        return findElementBinarySearch(arr,target,peek,arr.length-1);
    }
    public  static int findMountainPeek(int[] arr)
    {
        int start=0,end= arr.length-1;
        while (start<end)
        {
            int mid=start+(end-start)/2;
            if(arr[mid]>arr[mid+1])
            {
                end=mid;
            }
            else if(arr[mid+1]>arr[mid])
            {
                start=mid+1;
            }

        }
        return start;
    }

    public  static int findElementBinarySearch(int[] arr,int target,int start,int end)
    {
        boolean isAscending=arr[start]<arr[end];
        while (start<=end)
        {
            int mid=start+(end-start)/2;
            if (arr[mid]==target)
            {
                return mid;
            }
            if(isAscending)
            {
                if(arr[mid]>target)
                {
                    end=mid-1;
                }
                else if(arr[mid]<target)
                {
                    start=mid+1;
                }
            }else {
                if(arr[mid]>target)
                {
                    start=mid+1;
                }
                else if(arr[mid]<target)
                {
                    end=mid-1;
                }
            }
        }
        return -1;
    }











}
