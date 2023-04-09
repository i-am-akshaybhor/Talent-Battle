import java.util.*;
public class day_60 {
    public static void main(String[] args) {
        
        System.out.println("Enter No. of Test Cases .. ");
        Scanner sc= new Scanner(System.in);
        int T = sc.nextInt();

        int n ;
        
        while(T --> 0)
        {
            int SD=0;
            int RD=0;
            for(int i = 0 ; i<7 ; i++ )
            {
                n = sc.nextInt();

                if (n == 1 )
                SD++;
                else
                RD++;
            }

            if(SD>RD)
            {
                System.out.println("YES");
            }

            else
            {
                System.out.println("NO");
            }
        }

    }
}
