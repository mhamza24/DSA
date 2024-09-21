package BinarySeach;

public class CeilingAndFlooringOfANumber
{
    public static void main(String[] args) {

        int[] arr = {2,3,5,9,14,16,18};

        int res1 =CeilingNumber(arr,10);
        System.out.println("CeilingNumber "+res1);
        int res2 =FlooringNumber(arr,6);
        System.out.println("FlooringNumber "+res2);



    }

    private static int CeilingNumber(int[] arr, int i) {

        if(arr.length==0)
        {
            return -1;
        }

        int left=0,right= arr.length-1,mid=0;
        while (left<=right)
        {
            mid=left+(right-left)/2;
            if(arr[mid]==i)
            {
                return arr[mid];
            }

            if(arr[mid]>i)
            {
                right=mid-1;
            }
            else if(arr[mid]<i) {
                left=mid+1;
            }

        }

        return arr[left];
    }

    private static int FlooringNumber(int[] arr, int i) {

        if(arr.length==0)
        {
            return -1;
        }

        int left=0,right= arr.length-1,mid=0;
        while (left<=right)
        {
            mid=left+(right-left)/2;
            if(arr[mid]==i)
            {
                return arr[mid];
            }

            if(arr[mid]>i)
            {
                right=mid-1;
            }
            else if(arr[mid]<i) {
                left=mid+1;
            }

        }

        return arr[right];
    }
}
