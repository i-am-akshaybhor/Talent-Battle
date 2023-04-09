import java.util.*;

public class day_57 {
    public static void main(String[] args) {
        System.out.println("Enter no of Test Cases .. ");
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int N[] = new int[T];
        int X[] = new int[T];
        int P[] = new int[T];
        System.out.println("Enter no. of questions , Correct questions and minimum passing marks ..");
        for(int i=0 ; i<T ;i++)
        {
            N[i] = sc.nextInt();
            X[i] = sc.nextInt();
            P[i] = sc.nextInt();
        }
        
        
        for(int i=0 ; i<T ;i++)
        {
            if( (X[i]*4 - N[i]) >= P[i])
                System.out.println("Pass");
            else
                System.out.println("Fail");
        }
    }
}

