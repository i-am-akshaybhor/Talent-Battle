import java.util.*;
public class day_18 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Fraction no.. *--Seperate by space--* ");
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();

        System.out.println("Enter Second Fraction no.. *--Seperate by space--* ");
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();

        int x3 = (x1*y2) + (x2*y1);
        int y3 = (y1*y2);
        
        System.out.println("Addtion of given Fraction numbers are.. ");
        if(x3 % y3 == 0)
        System.out.println(x3/y3 + " / 1");

        else
        System.out.println(x3 + " / " +y3);

    }
}
