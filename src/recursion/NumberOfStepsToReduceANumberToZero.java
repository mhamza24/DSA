package recursion;

public class NumberOfStepsToReduceANumberToZero {
    public static void main(String[] args) {
    int n=14;
        System.out.println(numberOfSteps(n));
    }

    public static int numberOfSteps(int num) {
       return numberOfStepsHelper(num,0);
    }

    public static int numberOfStepsHelper(int num, int steps) {
        if (num==0)
        {
            return steps;
        }
        if((num&1)==0)
        {
            return  numberOfStepsHelper(num/2,++steps);
        }
        else
        {
            return numberOfStepsHelper(num-1,++steps);
        }

    }
}
