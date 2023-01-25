import java.util.*;

class day6{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        if(n1 > 0 && n2 > 0)
        System.out.println("This point lies in first quadrant. ");
        
        else if(n1 < 0 && n2 > 0)
        System.out.println("This point lies in second quadrant. ");
        
        else if(n1 < 0 && n2 < 0)
        System.out.println("This point lies in third quadrant. ");
        
        else
        System.out.println("This point lies in fourth quadrant. ");
    }
}