import java.util.Arrays;
import java.util.*;
public class day_39 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        String str1 = sc.next();
        String str2 = sc.next();

        if(str1.length() == str2.length())
        {
            str1 = str1.toLowerCase();
            str2 = str2.toLowerCase();

            char[] arr1 = str1.toCharArray();
            Arrays.sort(arr1);

            char[] arr2 = str2.toCharArray();
            Arrays.sort(arr2);

            boolean res = Arrays.equals(arr1, arr2);

            if(res == true)
            System.out.print("Anagram");

            else
            System.out.print("Not anagram");
        }

        else
        {
            System.out.println("Not anagram");
        }
    }
}
