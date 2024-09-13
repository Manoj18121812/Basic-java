package String_problem;

public class Reverse_string {

	public static void main(String[] args) {
		
	//method 1
		
		String str="manoj gavhane";
		char rahul[]=str.toCharArray();
		for(int i=rahul.length-1;i>=0;i--) {
			System.out.print(rahul[i]);
		}
		System.out.println(" ");
		
	//method 2

	for(int i=str.length()-1;i>=0;i--) {
		System.out.print(str.charAt(i));
		
		
	}
	System.out.println(" ");
	
	//method 3
	
			StringBuffer sb=new StringBuffer(str);
			System.out.print(sb.reverse());
			
			System.out.println(" ");
			
			
	//method 4
			
			StringBuilder sbb=new StringBuilder(str);
			System.out.println(sbb.reverse());
	}

}
