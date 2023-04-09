import java.util.Scanner;

public class day_61 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number of test cases .. ");
        int T = sc.nextInt();

        while(T--> 0)
        {
            int a = sc.nextInt();
            int b = sc.nextInt();

            if (a+b <3)
            System.out.println(1);
            else if (3<= (a+b) && (a+b)<=10)
            System.out.println(2);
            else if( 11 <= (a+b) && (a+b)<=60 )
            System.out.println(3);
            else if ( 60 < a+b)
            System.out.println(4);
            

        }
    }
}
