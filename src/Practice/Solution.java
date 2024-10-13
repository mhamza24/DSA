package Practice;

import java.util.Arrays;

//here we will solve each question and then add that as a string in enum class
public class Solution
{
    public static void main(String[] args) {
       int[] arr={7,2,5,10,8};
        System.out.println(splitArray(arr,2));
    }


    public static int splitArray(int[] nums, int k) {
        int start=0,end=0,j=0;
        for (int i=0;i<nums.length;i++){
            start=Math.max(start,nums[i]);
             end+=nums[i];
        }

        while (start<end){

            int mid =start+(end-start)/2;
            System.out.println("Iteration: "+j+++" "+"Mid: "+mid);
            int sum=0,pieces=1;
            for (int num:nums){
                if(sum+num>mid){
                    sum=num;
                    pieces++;
                }
                else {
                    sum+=num;
                }
            }

            if(pieces>k){
                start=mid+1;
            }
            else {
                end=mid;
            }


        }


        return start;
    }



}
