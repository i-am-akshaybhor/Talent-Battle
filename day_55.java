import java.util.*;

class day_55{
    public static void main(String[] args) {
            
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter Size of Vector ");
        int n = sc.nextInt();
        int[] arr1 = new int[n];
        int[] arr2 = new int[n];

        System.out.println("Enter " + n + " Elements of Vector 1 ");

        for(int i=0 ; i<n ; i++)
        {
            arr1[i] = sc.nextInt();
        }

        System.out.println("Enter " + n + " Elements of Vector 2 ");

        for(int i=0 ; i<n ; i++)
        {
            arr2[i] = sc.nextInt();
        }

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        int DP =0 ;
        for(int i=0 ; i<n ; i++)
        {
            DP += arr1[i]*arr2[i];
        }

        System.out.println("Maximum Scaler Product of Given Vectors is = " +DP);


        sc.close();
    }
}

