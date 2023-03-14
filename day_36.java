import java.util.*;
public class day_36 {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String");
        String str = sc.nextLine();

        String ns = "";
        String[] str1 = str.split("\\s");   

        for (String string : str1) 
        {
            int length = string.length();
            String f = string.substring(0, 1);
            String r = string.substring(1, length - 1);
            String l = Character.toString(string.charAt(length-1));
            ns = ns + f.toUpperCase() + r + l.toUpperCase();
        }
            System.out.println(ns);
   }
}
