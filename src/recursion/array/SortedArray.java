package recursion.array;

public class SortedArray {
    public static void main(String[] args) {
    int[] arr ={1,2,3,5,7,8,12};
        System.out.println(sorted(arr,0));
    }

    public  static  boolean sorted(int[] arr,int i)
    {

        if(i==arr.length-1)
        {
            return true;
        }

//        if(arr[i]<arr[i] && sorted(arr,++i))
//        {
//            return true;
//        }

        return arr[i]<arr[i+1] && sorted(arr,++i);
    }


}
