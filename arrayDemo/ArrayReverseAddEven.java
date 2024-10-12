package arrayDemo;
import java.util.Arrays;
public class ArrayReverseAddEven {

	public static void main(String[] args) {
		int []arr= {10,20,30,40,50,60};
		
		int n=arr.length;
		
		for(int i=0;i<n/2;i++) {
			int temp =arr[i];
			arr[i]=arr[n-i-1];
			arr[n-i-1] = temp;
		}
		
		System.out.println(Arrays.toString(arr));
		
		int sum = 0;
		
		for(int i=0;i<arr.length;i++)
			if(i % 2 == 0) {
			sum = arr[i] + sum;}
		System.out.println(sum);

	}

}
