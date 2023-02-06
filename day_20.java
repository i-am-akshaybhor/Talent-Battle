import java.util.*;

public class day_20 {
    public static void main(String[] args) {
        int no,cnt=0; 
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");
        no = sc.nextInt();

        if(no <2)
        {
            System.out.println("no is not prime");
        }
        else
        {
                
            for( int i=2 ; i<= no/2 ; i++)
            {
                if(no %i ==0)
                cnt++;
            }


            if (cnt == 0)
            System.out.println("no is prime");
            else
            System.out.println("no is not prime");
        
        }


    }
}
