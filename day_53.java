import java.util.*;
public class day_53 {
    static int MaxSubArrProd(int arr[], int n)
    {
        int ans = arr[0];
        for (int i = 0; i < n; i++)
        {
            int prod = arr[i];
            for (int j = i + 1; j < n; j++)
            {
                ans = Math.max(ans,prod);
                prod =prod * arr[j];
            }
            ans = Math.max(ans,prod);
        }
        return ans;
    }
    public static void main(String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of array .. ");
        int n = sc.nextInt();
        System.out.println("Enter Array Elements .. ");
        int arr[] = new int[n];
        for(int i = 0 ; i<n ; i++)
        {
            arr[i] = sc.nextInt();
        }

        System.out.println("Maximum product subarray in a given array is .. ");
        System.out.print(MaxSubArrProd(arr,n));
    }

}
