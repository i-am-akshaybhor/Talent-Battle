import java.util.Scanner;
import java.util.*;
public class day_26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of people in the room.. ");
        int no = sc.nextInt();

        int handshake = no * (no-1)/2;

        System.out.print("Total Hand Shakes possible among " +no +" peoples are " + handshake);
    }
}
