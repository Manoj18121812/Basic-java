package arrayDemo;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayInputReverse {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the size of Array");
	int size=sc.nextInt();
	int arr[] = new int[size];
	
	for(int i=0;i<arr.length;i++) {
		arr[i] = sc.nextInt();
		
	}
	System.out.println(Arrays.toString(arr));
			int n=arr.length;
	
	for(int i=0;i<arr.length/2;i++) {
		int temp = arr[i];
		arr[i] = arr[n-i-1];
		arr[n-i-1] = temp;
	}
	
	System.out.println(Arrays.toString(arr));
	int sum =0;
	for(int i=0;i<arr.length;i++) 
		if(i % 2==0) {
		
		sum = sum + arr[i];
	
		}
	
	System.out.println("Sum of array "+ sum);
	
	
	}

}
