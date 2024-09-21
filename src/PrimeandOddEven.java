public class PrimeandOddEven {
    public static void main(String[] args) {
        int x=36;
        //int i=1;
      boolean isPrime=true;
        if(x%2==0)
        {
            System.out.println("even");
        }
        else {
            System.out.println("odd");
        }
        for(int i=2;i<x;i++)     //Math.sqrt(x)-comlexity reduce by half
        {
            System.out.println("loop"+i);
            if(x%i==0)
            {
                isPrime=false;
                break;
            }
        }
        System.out.println(isPrime);
        if(isPrime){
            System.out.println("PRIME");
        }
        else {
            System.out.println("NOT PRIME");
        }
    }
}
