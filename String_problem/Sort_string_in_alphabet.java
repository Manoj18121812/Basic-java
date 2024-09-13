package String_problem;
import java.util.Arrays;
public class Sort_string_in_alphabet {

	public static void main(String[] args) {
		
		String str="rock";
		char arr[]=str.toCharArray();
		char temp;
		
	for(int i=0;i<arr.length;i++) {
		for(int j=i+1;j<arr.length;j++) {
			if(arr[i] > arr[j]) {
				
				temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
	}
	System.out.println(new String(arr));
	
	
	//method 2
	String str1="manoj kanifnath gavhane";
	char[] charArray=str1.toCharArray();
	Arrays.sort(charArray);
	char[] str3=charArray;
	System.out.println(str3);
	System.out.println(new String(charArray));
	
	}

}
