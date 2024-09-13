package String_problem;

public class Remove_special_char {

	public static void main(String[] args) {
	String str="@m^an*o&j^ gavh+!ane";
	
	String manoj=str.replaceAll("[^a-zA-Z0-9]","");
System.out.println(manoj);

	}

}
