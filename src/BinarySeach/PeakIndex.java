package BinarySeach;

public class PeakIndex {


    public static void main(String[] args) {
//        int[] arr={0,2,1,0};
        int[] arr={2,3,5,8,10,9,4,0};
        System.out.println(binarySearch(arr));

    }
    static int binarySearch(int[] arr){

        int mid=0,left=0,right=arr.length-1;
        while(left<right){
            if(arr.length==0)
            {
                return -1;
            }
            mid=left+(right-left)/2;


            if(arr[mid]>arr[mid+1])
            {
                right=mid;
            }
            else
            {
                left=mid+1;
            }

        }
        return left;
    }
}
