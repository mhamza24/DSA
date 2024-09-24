package BinarySeach;

//AMAZON
public class SearchingInInfiniteArray {
    public static void main(String[] args) {
        int[] arr={3,5,7,9,10,90,100,130,140,160,170};
        int ans=findingSubArray(arr,90);
        System.out.println(ans);


    }

static  int findingSubArray(int[] arr,int target){
        int start =0;
        int end=1;

        while (target>arr[end])
        {
            int newStart=end+1;
            end=end+((end-start+1)*2);
            start=newStart;

        }

        return binarySearch(arr,target,start,end);

}


    static int binarySearch(int[] arr,int target,int left,int right){

        int mid=0;
        while(left<=right){
            if(arr.length==0)
            {
                return -1;
            }
            mid=left+(right-left)/2;
            if(arr[mid]==target)
            {
                return mid;
            }

            if(arr[mid]>target)
            {
                right=mid-1;
            }
            else if(arr[mid]<target)
            {
                left=mid+1;
            }

        }
        return -1;
    }
}


