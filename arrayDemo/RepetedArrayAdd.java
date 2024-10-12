package arrayDemo;

public class RepetedArrayAdd {

	public static void main(String[] args) {
	int arr[]= {1,2,3,1,5,1};
	int sum=0;
	int notsum=0;
	for(int i=0;i<arr.length;i++) {
		for(int j=i+1;j<arr.length;j++) 
		{
			if(arr[i]==arr[j]) {
				 sum=arr[i]+sum;
			}
			else  {
					 notsum=notsum +arr[i];
				}
				 
			}
		}
	
	System.out.println(notsum);
	

	}

}
