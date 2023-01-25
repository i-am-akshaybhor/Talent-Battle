import java.util.*;

class day7{

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter Month. ");
        int m = sc.nextInt();

        System.out.println("Enter Year. ");
        int y = sc.nextInt();

        if(y%4 == 0 && m == 2)
        {
            System.out.println("29");
        }
        else if (m == 2)
        System.out.println("28");

        else if ( m == 1 || m == 3 || m == 5 || m == 7 || m == 8 || m==10 || m == 12 )
        System.out.println("31");

        else 
        System.out.println("30");

    }

    
}