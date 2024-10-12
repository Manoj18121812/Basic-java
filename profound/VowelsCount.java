package profound;
import java.util.Scanner;
public class VowelsCount {

	public static void main(String[] args) 
	{
		System.out.println("Enter The String");
		Scanner sc=new Scanner (System.in);
		String s=sc.nextLine();
		StringBuffer sb=new StringBuffer(s);
		int vowels=0;
		for(int i=0;i<sb.length();i++) {
			if(sb.charAt(i)=='a' || sb.charAt(i)=='e'||
				sb.charAt(i)=='i' || sb.charAt(i)=='o'||
				sb.charAt(i)=='u' || sb.charAt(i)=='A'||
				sb.charAt(i)=='E' || sb.charAt(i)=='I'||
				sb.charAt(i)=='O' || sb.charAt(i)=='U')
				vowels++;
		}
		System.out.println(vowels );
	}

}
