package patterns;

import java.util.*;

public class Six {
//      *
//     * *
//    * * *
//   * * * *
//  * * * * *
//   * * * *
//    * * *
//     * *
//      *
    public static void main(String[] args) {
        Scanner box = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int n = box.nextInt();

        for (int i = 1; i <= n * 2 - 1; i++) {
            int cols = i <= n ? i : n * 2 - i;
            int noOfSpaces = n - cols;
            for (int j = 1; j <= noOfSpaces; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= cols; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}
