import java.util.Scanner;
public class day_22 { 

public static boolean isPrime(int n) {
        if (n <= 1) {
        return false;
        }
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
            return false;
        }
    }
    return true;
}

    public static void main(String args[]) 
    { 
        int no;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number ");
        no = sc.nextInt();
    
    for(int i=1;i<=no;i++){
           for(int j=1;j<=i;j++){
            if(isPrime(i) && isPrime(j)){
                if(i + j == no) {   
                    System.out.println(no+ " can be expressed as sum of " +i+ " and " +j);
                }
            }     
           } 
        } 
}
}