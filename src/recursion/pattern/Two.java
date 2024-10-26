package recursion.pattern;

public class Two {
    public static void main(String[] args) {
        printing(1,0);
    }

    public static void printing(int row,int col){
        if(row==0)
        {
            return;
        }

        if(col<row)
        {
            System.out.print("* ");
            printing(row,++col);
        }
        else {
            System.out.println();
            printing(--row,0);
        }


    }
}
