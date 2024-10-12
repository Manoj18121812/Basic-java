package profound;

public class Thisdemo {

	int a;
	String manoj;
	Thisdemo(int a,String manoj)
	{
		this.a=a;
		this.manoj=manoj;
		System.out.println(a + manoj);
	}
	public String toString(){
		return  a + manoj;
	}
	public String manoj() {
		return "mm" + a + manoj;
	}
	
	public static void main(String[] args) {
		
		
		Thisdemo m=new Thisdemo(1,"manoj");
		System.out.println(m.manoj());
		System.out.println(m);
	
	
	}

}
