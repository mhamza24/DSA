package BinarySeach;

//status=0;
//Amazon,Google

//https://chatgpt.com/share/66f2d5af-d9d8-8003-9ccf-7065cd67eafb
public class SearchInRotatedSortedArray
{
    public static void main(String[] args) {
//    int[] arr={4,5,6,7,0,1,2};

        //int[] arr={3,4,5,6,7,0,1,2};
        int[] arr={3,1};
        System.out.println(Search(arr,1));



        //{4,5,6,7,0,1,2};
        // 0,1,2,3,4,5,6,
    }
    static int Search(int[] arr,int target){
        int pivot=pivot(arr);

        if(pivot==-1)
        {
            return  binarySearch(arr,target,0,arr.length-1);
        }

        if(arr[pivot]==target)
        {
            return pivot;
        }

        if(target>=arr[0])
        {
            return binarySearch(arr,target,0,pivot-1);
        }
        else {
            return  binarySearch(arr,target,pivot+1,arr.length-1);
        }

    }


    static public int binarySearch(int[] arr,int target,int start,int end){


        while (start<=end)
        {
            int mid=start+(end-start)/2;
            System.out.println(mid);
            if (arr[mid]==target)
            {
                return mid;
            }
            if(arr[mid]>target)
            {
                end=mid-1;
            }
            else if(arr[mid]<target)
            {
                start=mid+1;
            }
        }
        return -1;
    }

    //this is not for duplicates
    static int pivot(int[] arr){
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

            if(arr[mid] <= arr[start])
            {
                end= mid-1;
            }
            else {
                start=mid+1;
            }


        }
        return -1;
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
