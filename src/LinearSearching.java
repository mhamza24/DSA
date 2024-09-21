import java.util.Arrays;

public class LinearSearching
{
    static int FunctionLinearSearching(int[] arr,int target)
    {
        if(arr.length==0)
        {
            return -1;
        }
        for(int i=0;i< arr.length;i++)
        {
            if(arr[i]==target)
            {
                System.out.println("14 found at "+i+" index");
                return i;
            }
        }
        return -1;


    }


    static boolean StringSearching(String str,char target){
        if(str.length()==0)
        {
            return false;
        }

        for (char ch:str.toCharArray()
             ) {

            if(ch==target)
            {
                return true;
            }
        }
        return false;
    }


    static boolean SearchingInArrayIn(int[] arr,int range,int start,int target){
        if(arr.length==0)
        {
            return false;
        }
        for (int i = start-1; i <= range; i++) {
            System.out.println(arr[i]);
            if(arr[i]==target)
            {
                return true;
            }
        }
        return false;
    }


    public static void main(String[] args) {
        int[] arr ={18,12,9,14,77,50};
        String name ="MUHAMMAD HAMZA KHALID";
        char target='z';
        boolean stringRes=StringSearching(name.toLowerCase(),target);
        System.out.println("stringRes"+stringRes);

//        System.out.println(Arrays.toString(arr));
//
//
//        for(int i=0;i< arr.length;i++)
//        {
//            if(arr[i]==14)
//            {
//                System.out.println("14 found at "+i+" index");
//                break;
//            }
//        }
//        for (int num:arr
//             ) {
//            if(num==14)
//            {
//                System.out.println("14 found ");
//                break;
//            }
//        }
        int res=FunctionLinearSearching(arr,14);
        System.out.println(res);
        System.out.println();

        boolean res2=SearchingInArrayIn(arr,3,2,14);
        System.out.println(res2);


    }

}
