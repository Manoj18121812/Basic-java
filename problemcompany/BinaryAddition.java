package problemcompany;
import java.util.Scanner;
public class BinaryAddition {

    public static void main(String[] args) {
       
    	/*Scanner sc=new Scanner(System.in);
        String binary1 = sc.nextLine(); 
        String binary2 = sc.nextLine(); 

        String result = manoj(binary1, binary2);


        System.out.println("The sum of binary numbers " + binary1 + " and " + binary2 + " is: " + result);
    }

    public static String manoj(String binary1, String binary2) {
        
        int num1 = Integer.parseInt(binary1, 2);
        int num2 = Integer.parseInt(binary2, 2);
        
        int sum = num1 + num2;

        return Integer.toBinaryString(sum);*/
        
        
        
        
        
        
        
        Scanner sc=new Scanner(System.in);
        
        String First=sc.nextLine();
        String Second=sc.nextLine();
        
        int s1=Integer.parseInt(First,2);
        int s2=Integer.parseInt(Second,2);
        
       int sum=s1 + s2;
       System.out.println("the Addition  is "+Integer.toBinaryString(sum)+ " decimal number is " + sum);
       
        
        
        
        
        
        
        
    	
       
    }
}

