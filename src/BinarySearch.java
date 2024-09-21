public class BinarySearch
{
    public static void main(String[] args) {
      int[] arr={1,7,9,12,24,39,45,50 };
   //     int[] arr={50,45,39,24,12,9,7,1};

//        boolean res=FBinarySearch(arr,45);
//        System.out.println(res);
        boolean res=OrderAgnosticBinarySearch(arr,45);
        System.out.println(res);


    }

    static  boolean FBinarySearch(int[] arr,int target)
    {
        if(arr.length==0)
        {
            return false;
        }
       int left=0,right=arr.length-1;
        while (left<=right)
        {

            int mid=left+(right-left)/2;
            System.out.println(mid+""+left+""+right);
//            if(arr[mid]==target)
//            {
//                return true;
//            }
            if(arr[mid]>target)
            {
                right=mid-1;
            }
            else if (
                    arr[mid]<target
            ){
                left=mid+1;
            }
            else {
                return true;
            }
        }

        return false;
    }



    static  boolean OrderAgnosticBinarySearch(int[] arr,int target)
    {
        if(arr.length==0)
        {
            return false;
        }
        int left=0,right=arr.length-1;
        boolean isAscending=arr[left] < arr[right];
        while (left<=right)
        {

            int mid=left+(right-left)/2;
            System.out.println(mid+""+left+""+right);
            if(arr[mid]==target)
            {
                return true;
            }

if(isAscending)
{
    if(arr[mid]>target)
    {
        right=mid-1;
    }
    else if (
            arr[mid]<target
    ){
        left=left+1;
    }
}else {


    if(arr[mid]<target)
    {
        right=mid-1;
    }
    else if (
            arr[mid]>target
    ){
        left=mid+1;
    }
}


        }

        return false;
    }
}
