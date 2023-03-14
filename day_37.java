import java.util.Scanner;
public class day_37  
{  
     public static void main(String[] args) 
     {  
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String..");
        String str = sc.nextLine();

        int[] freq = new int[str.length()];  
        char strarr[] = str.toCharArray();            
        
        for(int i = 0; i <str.length(); i++) 
        {  
            freq[i] = 1;  
            for(int j = i+1; j <str.length(); j++) 
            {  
                if(strarr[i] == strarr[j])
                {  
                    freq[i]++ ;  
                    strarr[j] = '0' ;  
                }  
            }  
        }            
        
        System.out.println("Characters  frequencies");  
        for(int i = 0; i <freq.length; i++) 
        {  
            if(strarr[i] != ' ' && strarr[i] != '0')  
                System.out.println("  " + astrarr[i] + "            " + freq[i]);  
        }  
    }  
}  