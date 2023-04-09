import java.util.*;
public class day_54 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of 1st array  .. ");
        int n = sc.nextInt();
        System.out.println("Enter Array Elements .. ");
        int arr[] = new int[n];
        for(int i = 0 ; i<n ; i++)
        {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter Size of 2nd array  .. ");
        int n1 = sc.nextInt();
        System.out.println("Enter Array Elements .. ");
        int arr1[] = new int[n1];
        for(int i = 0 ; i<n1 ; i++)
        {
            arr1[i] = sc.nextInt();
        }

        int cnt=0;

        for(int i=0 ; i<n ; i++)
        {
            for (int j=0 ; j<n1 ; j++)
            {
                if(arr1[j] == arr[i] )
                    cnt++;
            }
        }

        if(cnt>0)
        {
            System.out.println("Arrays are Not Disjoint.. ");
        }
        else
        {
            System.out.println("Arrays are Disjoint");
        }
    }
}

