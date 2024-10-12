package arrayDemo;

import java.util.Arrays;
public class ReverseArray {

	public static void main(String[] args) {
		
		int arr[]= {10,20,30,60,40,50};
		int n=arr.length;
		
		for(int i=0;i<n/2;i++) {
			int temp=arr[i];
			arr[i]=arr[n-i-1];
			arr[n-i-1]=temp;
		}
		System.out.println(Arrays.toString(arr));
	}

}
