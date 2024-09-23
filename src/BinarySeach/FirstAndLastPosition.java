package BinarySeach;

import java.util.Arrays;


//FACEBOOK
public class FirstAndLastPosition
{
    public static void main(String[] args) {
        int[] arr={5,7,7,8,8,10};
        int[] res=getFirstAndLastPosition(arr,8);
        System.out.println(Arrays.toString(res));

    }

    static int[] getFirstAndLastPosition(int[] arr,int target){

        int[] ans ={-1,-1};
        int start=search(arr,target,true);
        if(start!=-1){
            int last=search(arr,target,false);
        }


        return  ans;
    }

    static int search(int[] arr,int target,boolean isFirstPosition){

        int left=0,right=arr.length-1,mid=0,ans=-1;
        while (left<=right)
        {
            mid = left +(right-left)/2;

            if(arr[mid]==target)
            {
                ans=mid;
                if(isFirstPosition)
                {
                    right=mid-1;
                }
                else {
                    left=mid+1;
                }
            }


            if(arr[mid]>target)
            {
                right=mid-1;
            }
            else if(arr[mid]<target)  {
                left=mid+1;
            }
//            else {
//                ans=mid;
//                if(isFirstPosition)
//                {
//                    right=mid-1;
//                }
//                else {
//                    left=mid+1;
//                }
//            }

        }
        return ans;
    }

}
