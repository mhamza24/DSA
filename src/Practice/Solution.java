package Practice;
//here we will solve each question and then add that as a string in enum class
public class Solution
{
    public static void main(String[] args) {
    char[] letters = {'c','f','j'};

    }
    public char nextGreatestLetter(char[] letters, char target) {
        int start=0,end=letters.length-1;
        while (start<=end)
        {
            int mid=start+(end-start)/2;

            if(letters[mid]>target)
            {
                end=mid-1;
            }
            else {
                start=mid+1;
            }
        }
        return letters[start%letters.length];
    }



}
