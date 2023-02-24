import java.util.*;

public class day_34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String exp = sc.nextLine();

        String t = "";
        t = exp.replaceAll("[()]", "");
        System.out.println(t); 
    }
}
