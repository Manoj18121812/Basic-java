package String_problem;
import java.util.LinkedHashSet;
import java.util.*;
public class Remove_dupliicate_char_in_String {

	public static void main(String[] args) {
		
		//method-1
		
		String str="java programming by manoj ";
		StringBuilder sb1=new StringBuilder();
		str.chars().distinct().forEach(c -> sb1.append((char)c));
			System.out.println(sb1);



		//method-2

		StringBuilder sb2=new StringBuilder();
		for(int i=0;i<str.length();i++) {
			char ch= str.charAt(i);
			int idx= str.indexOf(ch,i+1);
			if(idx==-1) {
				sb2.append(ch);
			}
		}
		System.out.println(sb2);
		
		
		//method-3
		
		char[] arr=str.toCharArray();
		StringBuilder sb3=new StringBuilder();
		for(int i=0;i<arr.length;i++) {
			boolean repeted=false;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i] == arr[j]) {
					repeted=true;
					break;
				}
			}
			if(!repeted) {
				sb3.append(arr[i]);
			}
		}
		System.out.println(sb3);
		
		//method-4
		
		
		StringBuilder sb4 = new StringBuilder();
		Set<Character> set = new LinkedHashSet();
		for(int i=0;i<str.length();i++) {
			set.add(str.charAt(i));
		}
		for(Character c : set) {
			sb4.append(c);
		}
		System.out.println(sb4);
	}
}
