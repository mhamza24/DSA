package patterns;

import java.util.Scanner;

public class Four {
    // 1
    // 12
    // 123
    // 1234
    // 12345
    public static void main(String[] args) {
        Scanner box = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int n = box.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
