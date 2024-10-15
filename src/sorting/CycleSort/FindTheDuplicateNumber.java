package sorting.CycleSort;

import java.util.Arrays;
//Google
public class FindTheDuplicateNumber
{
    public static void main(String[] args) {
        int[] arr={1,3,4,2,2};
       // int[] arr={1,3,4,5,2};
        System.out.println(findDuplicate(arr));
    }



    public static  int findDuplicate(int[] nums) {
        sorting(nums);



        for (int i=0;i<nums.length;i++)
        {
            if(nums[i]!=i+1)
            {
                return nums[i];
            }
        }
        return -1;


    }


    public static  void sorting(int[] nums)
    {

        boolean[] count=new boolean[nums.length];
        System.out.println(Arrays.toString(count));
        System.out.println(count[nums[0]]);

        int i=0;
        while (i<nums.length)
        {
            int correctIndex=nums[i]-1;

            if(nums[i]<nums.length && nums[i]!=nums[correctIndex])
            {
                swapArrayValues(nums,i,correctIndex);
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
