package BinarySeach;

public class FindInMountainArray {
    public static void main(String[] args) {
    int[] arr={1,2,3,4,5,3,1};
    System.out.println(search(arr,3));

            //mountain or bitonic array doesn't contain duplicates

//        int[] arr={1,3,3,4,5,2,1};
//        System.out.println(search(arr,3));

    }
    static int search(int[] arr,int target){
    int peak=findPeak(arr,target,0,arr.length-1);

    int leftSide=binarySearch(arr,target,0,peak);
    if(leftSide!=-1)
    {
        return  leftSide;
    }
    //int rightSide=binarySearch(arr,target,peak,arr.length-1);

        return binarySearch(arr,target,peak,arr.length-1);
    }




    static int findPeak(int[] arr,int target,int start,int end){
        int mid=0;
        while(start<end){
            if(arr.length==0)
            {
                return -1;
            }
            mid=start+(end-start)/2;


            if(arr[mid]>arr[mid+1])
            {
                end=mid;
            }
            else
            {
                start=mid+1;
            }

        }
        return start;


    }


//    static public int search()

    static public int binarySearch(int[] arr,int target,int start,int end){
        boolean isAscending =arr[start]<arr[end];
        int mid=0;
        while (start<=end)
        {
            mid=start+(end-start)/2;
            if (arr[mid]==target)
            {
                return mid;
            }

            if(isAscending)
            {
                if(arr[mid]>target)
                {
                    end=mid-1;

                }
                else
                {
                    start=mid+1;
                }
            }
            else {

                if(arr[mid]>target)
                {
                    start=mid+1;

                }
                else
                {
                    end=mid-1;
                }
            }

        }
        return -1;
    }



}
