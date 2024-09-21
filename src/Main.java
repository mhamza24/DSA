// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
//    public static void main(String[] args) {
//        // Press Alt+Enter with your caret at the highlighted text to see how
//        // IntelliJ IDEA suggests fixing it.
//        System.out.printf("Hello and welcome!");
//
//        // Press Shift+F10 or click the green arrow button in the gutter to run the code.
//        for (int i = 1; i <= 5; i++) {
//
//            // Press Shift+F9 to start debugging your code. We have set one breakpoint
//            // for you, but you can always add more by pressing Ctrl+F8.
//            System.out.println("i = " + i);
//        }
//    }
public static void main(String[] args) {
    int i,m=0,flag=0;
    int n=36;//it is the number to be checked
    m=n/2;
    if(n==0||n==1){
        System.out.println(n+" is not prime number");
    }else{
        for(i=2;i<=m;i++){
            System.out.println(i+" "+n);
            if(n%i==0){
                System.out.println(n+" is not prime number");
                flag=1;
                break;
            }
        }
        if(flag==0)  { System.out.println(n+" is prime number"); }
    }//end of else
}

}

