package Practice;

import java.util.Arrays;

//here we will solve each question and then add that as a string in enum class
public class Solution
{
    public static void main(String[] args) {
        int[] arr={3,5,7,9,10,90,100,130,140,160,170};
        int ans=searchTarget(arr,80);
        System.out.println(ans);

    }


    static public int searchTarget(int[]  arr,int target)
    {
        int start=0,end=1;
        while (target>arr[end])
        {
            int newStart=end+1;
            end=end+((end-start+1)*2);
            start=newStart;
        }

        return binarySearch(arr,target,start,end);
    }

    static public int binarySearch(int[] arr,int target,int start,int end)
    {
        while (start<=end)
        {
            int mid=start+(end-start)/2;
            if(arr[mid]==target)
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
