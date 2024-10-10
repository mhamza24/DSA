package Practice;

import java.util.Arrays;

//here we will solve each question and then add that as a string in enum class
public class Solution
{
    public static void main(String[] args) {
        int[] arr={5,7,7,8,8,10};
//        int[] ans=searchRange(arr,7);
//        System.out.println(Arrays.toString(ans));



    }

    public int[] searchRange(int[] nums, int target) {
        int[] ans={-1,-1};
        int first=binarySearch(nums,target,true);
        if(first==-1)
        {
            return  ans;
        }
        int last=binarySearch(nums,target,false);

        return new int[] {first,last};
    }


     public int binarySearch(int[] arr,int target,boolean searchingFirstIndex){
        int ans=-1,start=0,end=arr.length-1,mid=0;
        while(start<=end)
        {
            mid=start+(end-start)/2;
            if(arr[mid]==target)
            {

                ans=mid;
                if(searchingFirstIndex)
                {
                    end=mid-1;
                }else {
                    start=mid+1;
                }


            }
            if(arr[mid]>target)
            {
                end=mid-1;

            } else if (arr[mid]<target) {
                start=mid+1;
            }

        }

        return ans;
    }




}
