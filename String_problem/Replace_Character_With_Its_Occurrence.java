package String_problem;
import java.util.Arrays;
import java.util.*;
public class Replace_Character_With_Its_Occurrence {

	public static void main(String[] args) {
		
		String str="maaaanoj kanifnath";
		char replace='a';
		
		if(str.indexOf(replace) == -1) {
			System.out.println("Given char is not aviliable instring");
			System.exit(0);
		}
		
		
		int count=1;
		char arr[]=str.toCharArray();
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i] == replace) {
				arr[i]=String.valueOf(count).charAt(0);
				count++;
			}
		}
		System.out.println(Arrays.toString(arr));
	}

}
