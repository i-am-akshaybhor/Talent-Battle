import java.util.*;
public class day_45 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in );

        System.out.println("Enter Size of Array :- ");
        int size = sc.nextInt();

        int[] arr = new int[size];
        System.out.println("Enter Array Elements :- ");
        for(int i=0 ; i< size ; i++)
        {
            arr[i] = sc.nextInt();
        }

        int small = arr[0];
        int large = arr[0];
        
        for (int i=0 ; i<size ; i++)
        {
            if(small > arr[i])
            small = arr[i];

            if(large < arr[i])
            large = arr[i];
        }

        System.out.println("Smallest Number in Array is :- ");
        System.out.println(small);

        System.out.println("Largest Number in Array is :- ");
        System.out.println(large);
    }
}
