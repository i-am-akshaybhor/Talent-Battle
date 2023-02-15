import java.util.*;
class day_28{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a String.. ");
        String str = sc.nextLine();

        String rev = new StringBuilder(str).reverse().toString();
        System.out.println("Rverse String is- " + rev);
    }
}