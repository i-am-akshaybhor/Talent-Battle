import java.util.*;

public class day_35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String ..- ");
        String str = sc.nextLine();
        int add= 0;
        System.out.print("Numbers in the given String are - ");
        for (int i =0 ;i<str.length(); i++ )
        {
            if(Character.isDigit(str.charAt(i)) )
            {
                System.out.print(str.charAt(i) + ",");
                int dt = Character.getNumericValue(str.charAt(i));
                add = add + dt;
            }
        }
        System.out.println();
        System.out.print("Sum of numbers in the given String are ..- " + add);
    }
}

