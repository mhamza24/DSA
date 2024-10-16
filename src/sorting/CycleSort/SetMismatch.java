package sorting.CycleSort;

import java.util.Arrays;

public class SetMismatch {
    public static void main(String[] args) {
        int[] nums = { 3, 2, 2 };

        System.out.println(Arrays.toString(findErrorNums(nums)));
    }

    public static int[] findErrorNums(int[] nums) {
        sorting(nums);
        System.out.println("Sorted " + Arrays.toString(nums));
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != i) {
                return new int[] { nums[i], i + 1 };
            }
        }

        return new int[] { -1, -1 };
    }

    public static void sorting(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int correctIndex = nums[i] - 1;
            if (nums[i] != nums[correctIndex]) {
                swapArrayValues(nums, i, correctIndex);
            } else {
                i++;
            }
        }
    }

    public static void swapArrayValues(int[] nums, int first, int second) {
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }

}
