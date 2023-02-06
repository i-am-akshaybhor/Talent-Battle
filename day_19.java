import java.util.*;
public class day_19 { 
    public static void main(String args[]) 
    {
        int no; 
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");
        no = sc.nextInt();
        sc.close();
        int numOfDigits = String.valueOf(no).length();
        int i = 1;
        int rem = 0;
        int sum=0;
        int temp = no;
        while(i<=no){
            rem = no % 10;
            sum = sum + (int) Math.pow(rem,numOfDigits);
            no = no / 10;
        } 
        if(temp == sum)
            System.out.println("Armstrong number");
        
        else
            System.out.println("Not an Armstrong number");
        
    } 
}