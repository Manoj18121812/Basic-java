package arrayDemo;

public class AddNonRepeatedEle {

	public static void main(String[] args) {
		
		int arr[]= {1,2,3,2,5,6,8};
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			
			int count=0;
			
			for(int j=0;j<arr.length;j++) {
				if(arr[i] == arr[j]) {
					count++;
				}
			}
			
			if(count == 1) {
				 sum = arr[i] + sum;
				 
			}
			
		}
		System.out.println(sum);
		
		//---------Using this reduce time complexity-----------
		int arr1[]= {1,2,3,2};
		int sum1=0;
		for(int i=0;i<arr1.length;i++) {
			
			int count=0;
			
			for(int j=0;j<arr1.length;j++) {
				if(arr1[i] == arr1[j]  && i != j) {
					count++;
				}
			}
			
			if(count == 0) {
				 sum1 = arr1[i] + sum1;
				 
			}
			
		}
		System.out.println(sum1);

	}

}
