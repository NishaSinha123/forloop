
import java.util.Scanner;

public class b{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  // Scanner for taking input

        System.out.print("Enter a number: ");
        int n = sc.nextInt();  // Take input from user

        int sum = 0;

        // Loop to calculate sum from 1 to n
        for (int i = 1; i <= n; i++) {
            sum += i;  // sum = sum + i
        }

        System.out.println("Sum of numbers from 1 to " + n + " is: " + sum);
        
        sc.close();  // Close the scanner
    }
}
