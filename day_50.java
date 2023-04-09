import java.util.*;

public class day_50 {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter The Size of Array .. ");
        int n = sc.nextInt();

        System.out.println("Enter The Array Element .. ");
        int[] arr = new int[n];
        for(int i = 0 ;i <n ; i++)
        {
            arr[i] = sc.nextInt();
        }

        System.out.println(Sos(arr , n ));

    }

    static long Sos(int arr[] , int n)
    {
        int sum = 0 ;

        for(int i=0 ; i<n ;i++)
        {
            sum+= arr[i]*arr[i];
        }
        return sum;
        
    }
}
