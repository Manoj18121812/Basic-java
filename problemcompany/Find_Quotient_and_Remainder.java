package problemcompany;
import java.util.Scanner;
public class Find_Quotient_and_Remainder {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int quotient;
		
		System.out.println("Enter the dividend");
		int dividend=sc.nextInt();
		System.out.println("Enter the divisor");
		int divisor=sc.nextInt();
		
		
		quotient=dividend/divisor;
		System.out.println("Quotient is :"+ quotient);
		int remainder=dividend%divisor;
		System.out.println("Remainder is :"+ remainder);
		
	}

}
