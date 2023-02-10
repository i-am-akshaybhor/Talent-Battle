import java.util.Scanner;

class day_23{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter The Number..");
        int no = sc.nextInt();

        
        String str = Integer.toString(no);
        String s1= "";
        int len = str.length();
        for(int i =0 ; i<len ; i++)
        {
            if(str.charAt(i) == '0')
            s1 = s1 + '1' ;

            else
            s1 = s1+str.charAt(i);

        } 

        System.out.println("Number Before Repalcing all 0's with 1's");
        System.out.println(no);
        System.out.println("Number After replacing all 0's with 1 -- ");
        System.out.print(s1);
    }
}