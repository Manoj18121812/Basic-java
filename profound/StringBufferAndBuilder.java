package profound;

public class StringBufferAndBuilder {

	public static void main(String[] args) {
		
		//Stringbuffer
		
		StringBuffer sb=new StringBuffer("Manoj");
		System.out.println("sb is ="+sb);
		System.out.println("Hashcode of sb is ="+sb.hashCode());
		
		sb.append(" Language");
		System.out.println("After Append sb is ="+sb);
		
		//Stringbuilder
		
		StringBuilder bs=new StringBuilder("Hi Manoj");
		System.out.println("sb is "+bs);
		System.out.println("Hashcode of bs is ="+bs);
		
		bs.append(" Bymanoj");
		System.out.println("bs is ="+bs);
		System.out.println("Hashcode of bs is ="+bs.hashCode());
		
	}

}
