import java.util.*;
class day_51
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter The Size of Array .. ");
        int n = sc.nextInt();

        System.out.println("Enter The Array Element .. ");
        int[] arr = new int[n];
        for(int i = 0 ; i<n ; i++)
        {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        // System.out.println(Arrays.toString(arr) );

        for(int i=0 ; i<n ; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
}