import java.util.Scanner;

class day_13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int no = sc.nextInt();
        int sum = 0;
        for(int i =1 ; i<=no ; i++ )
        {
            sum +=i ;

        }

        System.out.println(sum);
    }
    
}
