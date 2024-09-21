public class LeetCodeEvenNumbers {
    public static void main(String[] args) {
        int[] nums={12,345,2,6,7896};

        int res1 =findNumber1(nums);
        System.out.println("findNumber1 "+res1);
        int res2 =findNumber1(nums);
        System.out.println("findNumber2 "+res2);
    }

     static int findNumber1(int[] nums) {
        int evneNumbers=0;
        if(nums.length==0)
        {
            return -1;
        }

        for (int i = 0; i < nums.length; i++) {
            String number= String.valueOf(nums[i]);
            int count=0;
            for (char ch:number.toCharArray()
                 ) {
                count++;
            }
            if(count %2==0){
                evneNumbers++;
            }

        }
        return evneNumbers;
    }


    static  int findNumber2(int[] nums){
        int count=0;
        if(nums.length==0)
        {
            return -1;

        }

        for (int i = 0; i < nums.length; i++) {
            boolean res =EvenDigit(nums[i]);
            if(res)
            {
                count++;
            }
        }

        return count;
    }



    private static boolean EvenDigit(int num) {
        int count=0;
        while (num>0)
        {
            count++;
            num=num/10;
        }
        if(count%2==0)
        {
            return  true;
        }
        else {
            return false;
        }
    }


}
