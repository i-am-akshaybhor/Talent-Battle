import java.util.*;
import java.io.*;
public class day_33 {
public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter String ..- ");
    String str = sc.nextLine();
    StringBuffer rev = new StringBuffer(str);
    rev.reverse();
    System.out.println(rev);

    if (rev.toString().equals(str) )
    {
        System.out.println(str + " is a Palindrome String ");

    }

    else
    {
        System.out.println(str + " is Not a Palindrome String ");
    }

}
    
}
