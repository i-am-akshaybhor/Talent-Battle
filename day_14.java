import java.util.Scanner;

public class day_14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no..");
        int no = sc.nextInt();
        int rev= 0;
        for(;no !=0;)
        {
            if (no > 0)
            {
                int rem = no%10;
                // System.out.print(rem);
                rev = rev *10 +rem;
                no = no/10;
            }
            else
            {
                no = no * -1;
                int rem = no%10;
                System.out.print("-" +rem);
                no = no/10;

            }
            

        }
        System.out.print(rev);
    }
    
}
