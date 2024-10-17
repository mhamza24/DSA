package patterns;

import java.util.*;

public class Seven {
    public static void main(String[] args) {
        Scanner box = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int n = box.nextInt();

        for (int i = 1; i <= n; i++) {
            int space = n - i;
            for (int z = 1; z <= space; z++) {
                System.out.print(" ");
            }
            for (int j = i; j >= 1; j--) {
                System.out.print(j + "");
            }
            for (int j = 2; j <= i; j++) {
                System.out.print(j + "");
            }

            System.out.println();
        }
    }
}
