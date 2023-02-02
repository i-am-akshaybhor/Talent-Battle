import java.util.*;
public class day_16 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the number...");
        int no = sc.nextInt();
        int temp = no;
        int sum=0;

        System.out.print("The Factors of "+no +" is :- ");
        for(int i =1 ;i<=(temp/2) ; i++)
        {
            if (temp % i == 0)
            {
                sum+=i;
                System.out.print(i+",");
            }
        }

        System.out.println(" ");
        if(sum == no )
        {
            System.out.println(no + " is a perfect number..");
        }

        else
        {
            System.out.println(no + " is Not a perfect Number.." );
        }

    }
    
}
