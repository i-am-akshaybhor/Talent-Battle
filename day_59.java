import java.util.*;

public class day_59 {
    public static void main(String[] args) {
        System.out.println("Enter no of Test Cases .. ");
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int M[] = new int[T];
        int H[] = new int[T];
        int BMI[] = new int[T];
        System.out.println("Enter the value of M and H .. ");
        for(int i=0 ; i<T ;i++)
        {
            M[i] = sc.nextInt();
            H[i] = sc.nextInt();
            BMI[i] = M[i] / (H[i]*H[i]) ;
        }

        System.out.println("The Body Mass index of Anusree is .. ");
        for(int i=0 ; i<T ;i++)
        {
           
            if(BMI[i] <= 18)
            System.out.println("1");

            else if(BMI[i] > 18 && BMI[i] <25)
            System.out.println("2");

            else if(BMI[i] > 24 && BMI[i] <30)
            System.out.println("3");

            else if(BMI[i] > 29)
            System.out.println("4");
        }

    }
}
