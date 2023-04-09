import java.time.chrono.HijrahEra;
import java.util.*;

public class day_62 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while( T --> 0 )
        {
            int N = sc.nextInt();
            int X = sc.nextInt();
            int Y = sc.nextInt();

            if(Y*(N+1) >=X )
            System.out.println("YES");
            else
            System.out.println("NO");
        }

    }
}
