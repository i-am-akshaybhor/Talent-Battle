import java.util.*;
public class day_40 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Enter String. ");
        String str1 = sc.next();

        System.out.println("Enter String to removed. ");
        String str2 = sc.next();

        System.out.println("Enter new String. ");
        String str3 = sc.next();

        String newstr = str1.replace(str2,str3);

        System.out.println(newstr);
    }
}
