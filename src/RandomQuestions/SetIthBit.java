package RandomQuestions;

public class SetIthBit {
    public static void main(String[] args) {
        int num = 0b10110110; // Binary representation of the number
        int n = 5; // We want to find the 5th bit

        int mask = 1 << (n - 1); // Create the mask by left shifting
        System.out.println(mask);
        boolean isNthBitSet = (num | mask) != 0; // AND operation to check the bit

        if (isNthBitSet) {
            System.out.println(n + "th bit is 1");
        } else {
            System.out.println(n + "th bit is 0");
        }
    }
}
