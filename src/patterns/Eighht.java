package patterns;

import java.util.*;

import RandomQuestions.Main;

public class Eighht {
    public static void main(String[] args) {
        Scanner box = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int n = box.nextInt();

        // for (int i = 0; i <= n * 2 ; i++) {
        // for (int j = 0; j <= n * 2 ; j++) {
        // int number = n-Math.min(Math.min(i, j), Math.min((n*2) - i, (n*2) - j));
        // System.out.print(number + " ");
        // }

        // System.out.println();
        // }

        for (int i = 1; i <= n * 2 - 1; i++) {
            for (int j = 1; j <= n * 2 - 1; j++) {
                int number = n - Math.min(Math.min(i, j), Math.min((n * 2) - i, (n * 2) - j));
                System.out.print(number + " ");
            }

            System.out.println();
        }
    }

}
