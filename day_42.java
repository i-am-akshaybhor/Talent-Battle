    import java.util.*;
    public class day_42 {
        public static void main(String[] args) {
            
            Scanner sc = new Scanner(System.in);
            
            System.out.println("Enter Size of First Array.. ");
            int a1 = sc.nextInt();

            System.out.println("Enter Size of Second Array.. ");
            int a2 = sc.nextInt();

            int [] arr1 = new int[a1];
            int [] arr2 = new int[a2];

            System.out.println("Enter 1st Array Element.. ");
            for(int i=0 ; i<a1 ; i++ )
            {
                arr1[i] = sc.nextInt();
            }

            System.out.println("Enter 2nd Array Element.. ");
            for(int i=0 ; i<a2 ; i++ )
            {
                arr2[i] = sc.nextInt();
            }

            if(a1 == a2)
            {
                if(Arrays.equals(arr1, arr2))
                {
                    System.out.println("Given Arrays are Same");
                }
                else
                {
                    System.out.println("Given Arrays are Not Same");
                }

            }
            else
            {
                System.out.println("Given Arrays are Not Same");
            }
        }
    }
