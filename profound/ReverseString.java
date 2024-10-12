package profound;
import java.util.Scanner;
public class ReverseString {
	
	
	public static void solution(String s1) {
		StringBuffer sb=new StringBuffer(s1);
		String m="";
		for(int i=0;i<sb.length();i++) {
			
		m=sb.charAt(i)+m;
		}
System.out.println(m);
	}

	
	public static void main(String[] args) {
		System.out.println("Enter the String");
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		
		solution(s1);
	}

}
