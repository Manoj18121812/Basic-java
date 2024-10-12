package arrayDemo;

import java.util.Arrays;
import java.util.*;
public class MinMax {

	public static void main(String[] args) {
		int arr[]= {10,85,23,55,36,6};
		int min=arr[0];
		int max=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
			if(arr[i]<min) {
				min=arr[i];
			}
			
		}
		System.out.println("MAximum element is "+ max);
		System.out.println("Minimum element is "+min);
	}

}
