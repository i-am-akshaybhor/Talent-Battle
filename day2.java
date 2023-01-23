import java.util.*;

class day2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char s = sc.next().charAt(0);

        if (Character.isAlphabetic(s))
        {
            System.out.println("Aplhabet");
        }

        else
        {
            System.out.println("Not an Alphabet");
        }
      
    }
}