import java.util.Scanner;

public class day_32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.print("Enter String ..- ");
        String str = sc.nextLine();

        System.out.print("String After removing Vowels ..- ");
        // for (int i=0; i<str.length(); i++)
        // {
        //     if (str.charAt(i)== 'a' || str.charAt(i)== 'e' || str.charAt(i)== 'i' || str.charAt(i)== 'o' || str.charAt(i)== 'u' || str.charAt(i)== 'A' || str.charAt(i)== 'E' || str.charAt(i)== 'I' || str.charAt(i)== 'O' || str.charAt(i)== 'U')
        //     {

        //     }
        //     else
        //     {
        //         System.out.print(str.charAt(i));
        //     }
        // }

        String t = "";
        t = str.replaceAll("[aeiouAEIOU]", "");
        System.out.println(t); 

    
    }
}
