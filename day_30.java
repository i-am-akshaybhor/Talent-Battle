import java.util.Scanner;

public class day_30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        String str = sc.nextLine();

        int i=0;

        for (char c : str.toCharArray())
        i++;

        System.out.println(i);
    }
}
