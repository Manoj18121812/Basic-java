package problemcompany;
/*import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;*/
import java.util.*;

public class Rhymeclass {
	
	public static String ryming(String s1, List<String> s2,int n) {
		String w="No Word";
		int maxlength=0;
		
		for(String word: s2) {
			if(!word.equals(s1)) {
				
				
			int matchlength=getmatchlength(s1,word);
			
			if(matchlength>=n && maxlength<matchlength) {
				w=word;
				maxlength=matchlength;
			}
			
		}
		}
		return w;
		
	}
	
	public static int getmatchlength(String s1, String word) {
		int i=s1.length()-1;
		int j=word.length()-1;
		int sum=0;
		while(i>=0 && j>=0 && s1.charAt(i)==word.charAt(j)) {
			sum =sum+1;
			i--;
			j--;
		}
		return sum;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter string : ");
		String s1=sc.next();
		
		List<String> s2=new ArrayList<String>();
		System.out.println("Enter list element: ");
		for(int i=0;i<5;i++) {
			s2.add(sc.next());
		}
		
		System.out.println("Enter minimum matching: ");
		int n=sc.nextInt();
		
		
		
		System.out.println(ryming(s1,s2,n));
		

	}

}
