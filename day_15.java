import java.util.Scanner;

public class day_15 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter Number ..");
        int no = sc.nextInt();
        int sno = 0 ;
        int temp = no ;
        
        while(temp != 0)
        {
            int fact = 1;
            int rem = temp % 10;
            for ( int i=1; i<=rem; i++)
            {
                fact *= i ; 
            }

            sno += fact;

            temp /= 10;

        }

        if (sno ==  no)
        {
            
        System.out.println(no + " is Strong Number");
        }

        else
        {
            System.out.println(no + " is Not a Strong Number ");
        }
    }

    
}

