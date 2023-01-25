import java.util.*;

class day4{

    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);

        int no = sc.nextInt();
        if (no >0 )
        System.out.println("Positive Number");

        else if (no < 0 )
        System.out.println("Negative Number");

        else
        System.out.println("Neither positive nor negative");
    }
}