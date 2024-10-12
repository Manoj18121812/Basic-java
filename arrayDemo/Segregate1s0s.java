package arrayDemo;

import java.util.Arrays;

public class Segregate1s0s {

///input = 1,0,1,0,1,1,0,0
///output = [0, 0, 0, 0, 1, 1, 1, 1]	
	
	
	public static void main(String[] args) {
		int arr[]= {1,0,1,0,1,1,0,0};
		
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				int x=arr[i];
				int y=arr[j];
				if(x>y) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
System.out.println(Arrays.toString(arr));
	}

}
