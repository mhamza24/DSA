package sorting.CycleSort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindAllDuplicatesInAnArray {
    public static void main(String[] args) {
            int[] nums = {4,3,2,7,8,2,3,1};
        System.out.println(findDuplicates(nums));
    }

    public static List<Integer> findDuplicates(int[] nums) {
    sorting(nums);

    List<Integer> duplicates=new ArrayList<Integer>(nums.length);
    for (int i=0;i<nums.length;i++)
    {
        if(nums[i]!=i+1)
        {
            duplicates.add(nums[i]);
        }
    }
        return duplicates;

    }

    public static void sorting(int[] nums)
    {
        int i=0;
        while (i<nums.length)
        {
            int correctIndex=nums[i]-1;
            if(nums[i]!=nums[correctIndex])
            {
                swapArrayValues(nums,i,correctIndex);
            }
            else {
                i++;
            }
        }
    }

    public static void swapArrayValues(int[] nums,int a,int b)
    {
        int temp=nums[a];
        nums[a]=nums[b];
        nums[b]=temp;
    }


}
