package String_problem;

public class Remove_white_space {

	public static void main(String[] args) {
		String str="ma n o j ga vha ne";
		
		
		//trim is only use for removing first and last white space 
		/*String trimmedStr= str.trim();
		System.out.println(trimmedStr);*/
		
		String str1=str.replaceAll("\\s", "");
		System.out.println(str1);
	}

}
