import java.util.Scanner;

public class day_31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.print("Enter String ..- ");
        String str = sc.nextLine();

        String t="";

        System.out.print("String After toggle. - ");
        for (int i=0; i<str.length(); i++)
        {
            if (Character.isUpperCase(str.charAt(i)))
            {
                // t += Character.toLowerCase(str.charAt(i));
                System.out.print(Character.toLowerCase(str.charAt(i)));
            }
            else
            {
                // t += Character.toUpperCase(str.charAt(i));
                System.out.print(Character.toUpperCase(str.charAt(i)));
            }
        }

        // System.out.println(t);
    }
}
