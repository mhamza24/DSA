package binary;

import java.util.Arrays;

//Google
public class FlippingAnImage {
    public static void main(String[] args) {
        int[][] arr = { { 1, 1, 0 }, { 1, 0, 1 }, { 0, 0, 0 } };
        System.out.println(arr.length);
        System.out.println(Arrays.toString(flipAndInvertImage(arr)));
    }

    public static int[][] flipAndInvertImage(int[][] image) {

        for (int[] row : image) {
            for (int i = 0; i < (image[0].length + 1) / 2; i++) {
                int tmep = row[i] ^ 1;
                row[i] = row[image[0].length - 1 - i] ^ 1;
                row[image[0].length - 1 - i] = tmep;
            }
        }

        return image;
    }
}
