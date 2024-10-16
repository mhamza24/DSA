package sorting.CycleSort;

import java.util.Arrays;

//Amazon
public class FirstMissingPositive {
    public static void main(String[] args) {
        int[] arr = { 3,4,-1,1 };
        sorting(arr);
        // System.out.println(Arrays.toString(arr));
        System.out.println(firstMissingPositive(arr));
    }

    public static int firstMissingPositive(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != i + 1) {
                return i + 1;
            }
        }
        return nums.length + 1;
    }

    // public static int findingNumber(int[] arr) {
    // for (int i = 0; i < arr.length; i++) {
    // if (arr[i] != i + 1) {
    // return i + 1;
    // }
    // }
    // return arr.length + 1;
    // }

    public static void sorting(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correctIndex = arr[i] - 1;

            if (arr[i] > 0 && arr[i] <= arr.length && arr[i] != arr[correctIndex]) {
                swapArrayValues(arr, i, correctIndex);
            } else {
                i++;
            }

        }
    }

    public static void swapArrayValues(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

}
