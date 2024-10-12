package profound;

public class StringConcAndHashcode {

	public static void main(String[] args) {
		String s1="manoj";
		System.out.println("String s1 is="+s1);
		System.out.println("Hashcode Of This String is="+ s1.hashCode());
		
		
		s1=s1.concat("manoj");
		System.out.println(s1);
		System.out.println("Length Of String Is="+s1.length());
		System.out.println("Hashcode of This string s1 is="+s1.hashCode());
		
		System.out.println("Char at index 2 is =" + s1.charAt(2));
		System.out.println("Replacement Of char"+s1.replace('m', 'k'));
		System.out.println(s1.replace('k', 'M'));
	}

}
