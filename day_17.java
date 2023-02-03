import java.util.*;
public class day_17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number..");
        int no = sc.nextInt();

        System.out.print("Factors of " + no +" are = ");
        for(int i=1;i<=no;i++)
        {
            if(no%i == 0)
            {
                System.out.print(i+",");
            }
        }
    }
    
}
