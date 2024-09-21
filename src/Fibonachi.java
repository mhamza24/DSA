import java.util.Scanner;

public class Fibonachi {
    public static void main(String[] args) {
        Scanner box = new Scanner(System.in);
        System.out.print("Enter the nth number of series : ");
        int n=box.nextInt();
        int a=0,b=1,count=2;
        int temp;
        System.out.print(a+" "+b+" ");
        while(count<=n)
        {
            temp=b;
            b=a+b;
            a=temp;
            count++;
            System.out.print(b+" ");
        }

    }
}
