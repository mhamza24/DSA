package BinarySeach;
//status=0
//Google
public class SplitArrayLargestSum {
    public static void main(String[] args) {
    int[] arr={7,2,5,8,10};
        System.out.println(splitArray(arr,2));
    }

    static public int splitArray(int[] arr,int m){
        int start=0;//min value
        int  end=0;//max value
        for (int i = 0; i <arr.length ; i++) {
            start=Math.max(start,arr[i]);
            end+=arr[i];
        }

        while (start<end)
        {
            int mid=start+(end-start)/2;
            int sum=0;
            int pieces=1;
            for (int a:arr)
            {
                if(sum+a>mid)
                {
                    sum=a;
                    pieces++;
                }
                else {
                    sum+=a;
                }
            }

            if(pieces>m)
            {
                start=mid+1;
            }
            else {
                end=mid;
            }
        }
        return start; // or end as in last start==end so we will get our ans when while loop in break


    }
}
