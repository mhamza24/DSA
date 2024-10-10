package BinarySeach;
//status=1
public class SmallestGreater {
    public static void main(String[] args) {
    char[] letters={'c','f','j'};
    char res=nextGreatestLetter(letters,'j');
        System.out.println(res);
    }

    public static char nextGreaterLetter(char[] letters,char target)
    {

        if(letters.length==0)
        {
            throw  new IllegalStateException("Array is empty");
        }

        int left=0,right=letters.length-1,mid=0;
        while (left<=right)
        {

            mid=left+(right-left)/2;
            System.out.println("left "+left+","+"Right "+right+","+"Mid "+mid);

            if(letters[mid]>target)
            {

                right=mid-1;
            }
            else
            {
                left=mid+1;
            }
        }
        return letters[left];
    }


    static public char nextGreatestLetter(char[] letters, char target) {
        // Upper Bound Problem letters[i] > target
        int n = letters.length;
        int left = 0;
        int right = n-1;

        if(target >= letters[right])    return letters[left];

        while(left <= right) {
            int mid = (left + right)/2;

            if(letters[mid] > target) right = mid-1;
            else left = mid+1;
        }

        return letters[left];
    }


}




