import java.util.*;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
	
	int n;
        
        System.out.print("Enter the number of terms in the Fibonacci sequence: ");
         n = scanner.nextInt();

        if (n <= 0)
	 {
            System.out.println("Please enter a positive integer.");
        } 
	else {
            
            System.out.println("Fibonacci Sequence (first " + n + " terms):");
            for (int i = 0; i < n; i++) {
                System.out.print(fibonacci(i) + " ");
            }
        }