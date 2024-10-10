package Practice;

import java.util.Arrays;

//here we will solve each question and then add that as a string in enum class
public class Solution
{
    public static void main(String[] args) {
        int[] arr={2,3,5,8,10,9,4,0};
        System.out.println(binarySearch(arr,0,0,arr.length-1));
       // int[] arr={2,3,5,8,10,9,4,0};
       // System.out.println(ans);

    }

    public int peakIndexInMountainArray(int[] nums) {
        int start=0,end=nums.length-1;
        while (start<end)
        {
            int mid=start+(end-start)/2;
            if(nums[mid+1]>nums[mid])
            {
                start=mid+1;
            }
            else if(nums[mid+1]<nums[mid])
            {
                end=mid;
            }

        }
        return end;
    }

    static public int binarySearch(int[] arr,int target,int start,int end)
    {
        while (start<end)
        {
            int mid=start+(end-start)/2;
            if(arr[mid+1]>arr[mid])
            {
                start=mid+1;
            }
            else if(arr[mid+1]<arr[mid])
            {
                end=mid;
            }

        }
        return end;
    }










}
