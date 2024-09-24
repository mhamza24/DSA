package BinarySeach;

public class NoOfRotation
{
    public static void main(String[] args) {
    int[] arr={4,5,6,7,0,1,2};
        System.out.println(noOfRotations(arr));
    }

    static  int noOfRotations(int[] arr){
        int res=pivotDuplicates(arr);
        return res+1;
    }

    static int pivotDuplicates(int[] arr){
        int start=0,end=arr.length-1,mid=0;
        while (start<=end)
        {
            mid=start+(end-start)/2;


            if(mid<end && arr[mid]>arr[mid+1])
            {
                return mid;
            }

            if(mid>start && arr[mid]<arr[mid-1])
            {
                return mid-1;
            }

            if(arr[mid]==arr[start] && arr[mid]==arr[end])
            {
                if(arr[start]>arr[start+1])
                {
                    return start;
                }
                start++;
                if(arr[end]<arr[end-1])
                {
                    return end-1;
                }
                end--;

            }

            else if(arr[start]<arr[mid] || (arr[start]==arr[mid] && arr[mid]>arr[end]))
            {
                start=mid+1;
            }
            else {
                end=mid-1;
            }


        }
        return -1;
    }
}
