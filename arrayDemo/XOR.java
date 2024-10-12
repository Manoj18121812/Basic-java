package arrayDemo;

import java.util.Scanner;

public class XOR {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Size Of Array");
		int size = sc.nextInt();
		int arr[] = new int[size];
		
		System.out.println("Enter The Array Element");
		for(int i=0;i<arr.length;i++)
			arr[i] = sc.nextInt();
		
	int oddsum = 0;
	int xorsum = 0;
	for(int i=0;i<arr.length;i++) {
		if(i % 2 == 0) {
			xorsum =  arr[i] ^ xorsum;
		}
		else {
			oddsum = arr[i]+ oddsum; 
		}
		
	}
	
	int sum = oddsum - xorsum;
	System.out.println(sum);
	}

}
