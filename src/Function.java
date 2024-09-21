import java.lang.reflect.Array;
import java.util.Arrays;

public class Function {
    static void test(int ...v){
        System.out.println(Arrays.toString(v));

    }

    public static void main(String[] args) {
        test(1,2,7,12,3,0,4);
    }
}
