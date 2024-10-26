package recursion.array;

import java.util.ArrayList;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr ={1,2,3,5,7,7,8,12};
        System.out.println(searching(arr,0,7));
        System.out.println(searching(arr,0,7,new ArrayList<>()));
        ArrayList<Integer> ans =searching(arr,0,7,new ArrayList<>());
        System.out.println(ans);

        System.out.println(searchingWithInternalList(arr,0,7));
    }

    public  static  boolean searching(int[] arr,int i,int target)
    {

        if(i==arr.length)
        {
            return false;
        }

        if(arr[i]==target)
        {
            return true;
        }
        else {
            return searching(arr,++i,target);
        }

        //return arr[i]==target || searching(arr,++i,target);
    }


    public static ArrayList<Integer> searching(int[] arr, int i, int target, ArrayList<Integer> list)
    {

        if(i==arr.length)
        {
            return list;
        }

        if(arr[i]==target)
        {
           list.add(i);
        }


        return searching(arr,++i,target,list);
    }



    public static ArrayList<Integer> searchingWithInternalList(int[] arr, int i, int target)
    {
        ArrayList<Integer> list=new ArrayList<>(arr.length);
        if(i==arr.length)
        {
            return list;
        }

        if(arr[i]==target)
        {
            list.add(i);
        }
        ArrayList<Integer> previousAnswers=searchingWithInternalList(arr,++i,target);
        list.addAll(previousAnswers);

        return list;
    }
}
