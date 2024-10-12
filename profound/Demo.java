package profound;

class Mydate 
{
 private int day,month,year;
 
 public Mydate(int day,int month,int year) {
	 this.day=day;
	 this.month=month;
	 this.year=year;
 }
 
 public String toString()
 {
	 return day +"/" + month +"/"+  year;
 }
}
 
 class Emp
 {
	 private int id;
	 private String name;
	 private Mydate jdate;
	 

 public Emp(int id, String name, Mydate jdate) 
 {
	this.id=id;
	this.name=name;
	this.jdate=jdate;
 }
 public String toString()
 {
	 return " id=" + id +   "  name="+ name+"   joining date="+jdate;
 }}
 
 public class Demo
 {
	 public static void main(String []args)
	 {
		 Mydate d=new Mydate(02,03,2003);
		 Emp e=new Emp(1,"manoj",d);
	 
				 System.out.println(e);
	 }
 }

