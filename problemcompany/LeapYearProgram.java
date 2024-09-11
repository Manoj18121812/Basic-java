package problemcompany;

public class LeapYearProgram {

	public static void main(String[] args) {
		
		for( int i=2000;i<2050;i++) {
			if(i%4==0) {
				 
				System.out.println(i +" Leap year");
			}else {
				System.out.println(i + " Not a Leap Year");
			}
		}

	}

}
