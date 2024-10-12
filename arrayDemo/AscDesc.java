package arrayDemo;

import java.util.Arrays;

public class AscDesc {
//------------------------Ascending Order----------------
	public static void main(String[] args) {
		int arr[]= {10,20,30,4,5,63,89};
		
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				
				int x=arr[i];
				int y=arr[j];
				
			if(x>y) {
				int temp = arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
		}
System.out.println(Arrays.toString(arr));

//--------------------------Descending Order--------------

for(int i=0;i<arr.length;i++) {
	for(int j=i+1;j<arr.length;j++) {
		
		int x=arr[i];
		int y=arr[j];
		
	if(x<y) {
		int temp = arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}
}
}
System.out.println(Arrays.toString(arr));
	}

}
