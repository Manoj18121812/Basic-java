package problemcompany;

public class Compound_intrest {

	public static void main(String[] args) {
		double total;
	double p=15000, rate=5.5, time =3;
		
		total =p * (Math.pow((1 + rate / 100), time))-p;
System.out.println(total);
	}

}
