package patterns;

import java.util.*;

public class Five {
    // *
    // **
    // ***
    // ****
    // *****
    // ****
    // ***
    // **
    // *
    public static void main(String[] args) {
        Scanner box = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int n = box.nextInt();
        for (int i = 1; i <= n * 2 - 1; i++) {

            if (i <= n) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("*");
                }
            } else {
                for (int j = 1; j <= n * 2 - i; j++) {
                    System.out.print("*");
                }
            }

            System.out.println();
        }

        // for (int i = 1; i <= n * 2 - 1; i++) {
        // int cols = i <= n ? i : n * 2 - i;

        // for (int j = 1; j <= cols; j++) {
        // System.out.print("*");
        // }

        // System.out.println();
        // }
    }
}
