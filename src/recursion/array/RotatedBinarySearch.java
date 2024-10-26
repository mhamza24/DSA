package recursion.array;

public class RotatedBinarySearch {
    public static void main(String[] args) {
        int[] arr ={5,6,7,8,9,1,2,3};
        System.out.println(searching(arr,9,0,arr.length-1));
    }

    public static int  searching(int[] arr,int target,int start,int end) {

        if(start>end)
        {
            return -1;
        }


            int mid=start+(end-start)/2;

            if(arr[mid]==target)
            {
                return mid;
            }

            if(start<=arr[mid])
            {
                if(target>=arr[start] && target<=arr[mid])
                {
                    return searching(arr,target,start,mid-1);

                }
                else {
                    return searching(arr,target,mid+1,end);
                }
            }

            if(target>=arr[mid] && target<=arr[end])
            {
                return searching(arr,target,mid+1,end);
            }
             return searching(arr,target,start,mid-1);
        }



}
