package RandomQuestions;

public class StringsDetails {
    public static void main(String[] args) {
        comparison();
    }

    public static void comparison() {
        String a = "MHK";
        String b = "MHK";

        // String a = new String("MHK");
        // String b = new String("MHK");

        System.out.println("HashCode of a: " + a.hashCode() + "  HashCode of b: " + b.hashCode());
        System.out.println("Memory reference of a: " + System.identityHashCode(a));
        System.out.println("Memory reference of b: " + System.identityHashCode(b));

        System.out.println(a == b);

        System.out.println(a.equals(b));
    }

}
