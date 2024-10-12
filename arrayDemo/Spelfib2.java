package arrayDemo;
import java.util.Scanner;
public class Spelfib2 {
	
	    
	   
	    public static int specialFibonacci(int N) {
	        // Base cases
	        if (N == 0 || N == 1) {
	            return 1;
	        }

	        // Initialize the first two values of the series
	        int[] f = new int[N + 1];
	        f[0] = 1;
	        f[1] = 1;

	        // Calculate the Nth value using the given formula
	        for (int i = 2; i <= N; i++) {
	            f[i] = (f[i - 1]+  7*f[i - 2] + [N/4]) % 1000000000+7;
	        }

	        return f[N];
	    }

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        
	        System.out.println("Enter value of n");
	        int N = sc.nextInt();

	      
	        System.out.println(specialFibonacci(N));

	        sc.close();
	    }
	}


