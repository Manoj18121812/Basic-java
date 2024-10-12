package arrayDemo;

import java.util.Scanner;
import java.util.Arrays;
public class ArrayEvenOdd {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of Array");
		int size=sc.nextInt();
		int arr[]=new int[size];
		
		for(int i=0;i<arr.length;i++) {
			arr[i] = sc.nextInt();		
			
		}
		System.out.println(Arrays.toString(arr));
	
	int n= arr.length;
	for(int i=0;i<n;i++) 
		if(arr[i] % 2 ==0) {
			System.out.println("Even element is" + arr[i]);
		}
		else
		{
			System.out.println("Odd element is "+arr[i]);
		}
	

}
}
