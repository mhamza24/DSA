package patterns;

import java.util.Scanner;

public class Three {

    // *****
    // ****
    // ***
    // **
    // *
    public static void main(String[] args) {
        Scanner box = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int n = box.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
