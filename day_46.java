import java.util.*;
public class day_46 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Size of Array : ");
        int size = sc.nextInt();
        int [] arr = new int[size];
        System.out.println("Enter Elements in Array :- ");
        for(int i=0 ; i<size ; i++)
        {
            arr[i] = sc.nextInt();
        }

        int sum =0;
        for(int i=0 ; i<size ; i++)
        {
            sum += arr[i]; 
        }

        System.out.println("The sum of Given Array Elements is - " + sum);

    }
}
