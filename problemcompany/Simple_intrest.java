package problemcompany;
import java.util.Scanner;
public class Simple_intrest {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Principle amount");
		double principle=sc.nextDouble();
		System.out.println("Enter rate of intrest");
		int rate=sc.nextInt();
		System.out.println("Enter time");
		int time=sc.nextInt();
		double sum=(principle*rate*time)/100;
		System.out.println(sum);

	}

}
