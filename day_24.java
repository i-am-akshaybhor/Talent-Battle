import java.util.*;
public class day_24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of Lines .. ");
        int no = sc.nextInt();

        for(int i=1; i<=no ;i++)
        {
            for(int j=i; j<no; j++)
            {
                System.out.print(" ");
            }

            for(int k=1; k<=( (2*i)-1); k++)
            {
                System.out.print("*");
            }
            
            System.out.println("");
        }
    }
}
