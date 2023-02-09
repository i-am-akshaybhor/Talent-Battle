import java.util.*;
public class day_21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no..");
        int no = sc.nextInt();
        int temp=no;
        int rem=0;
        int rev=0;
        while(no!=0)
        {
            rem = no % 10;
            rev= 10*rev +rem;
            no/=10;
        }

        if(temp == rev)
        System.out.print("\n" + temp + " is a Palindrome Number...");
        
        else
        System.out.print("\n" + temp + " is Not a Palindrome Number...");

    }
}
