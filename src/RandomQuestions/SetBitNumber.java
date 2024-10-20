package RandomQuestions;

public class SetBitNumber {
    public static void main(String[] args) {
        int n = 9;
        System.out.println(Integer.toBinaryString(n));
        System.out.println(Integer.toBinaryString(-n));
        System.out.println(Integer.toBinaryString(n &-n));
        // System.out.println(Integer.toBinaryString(n & -n));
       System.out.println(countBits(n));

    }
                             
    // public static int countBits(int n) {
    //     int count = 0;
    //     while (n > 0) {
    //         if ((n & 1) == 1) {
    //             count++;
    //         }
    //         n = n >> 1;
    //     }
    //     return count;
    // }

    //n=n-(n&-n) here it isolates the LSB and filips all rest and add 1 + when we minuns the lsb got - means eliminated 
    //as this way we get  


   public static int countBits(int n) {
        int count = 0;
        while (n > 0) {
            count++;
            n -= (n & -n);
        }
        return count;
    }
}
