package arrayDemo;

public class MaxArrayElement {

	public static void main(String[] args) {
		int arr[] = {10,50,60,98,52};
		int max=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		System.out.println(max);

	}

}
