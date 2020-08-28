package ArrayProgram;
/** To find the largest and smallest element in the array */
public class LargestAndSmallestElementArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/** initial array */
		int arr[] = {1,2,3,4,5,6,7,8,9,10};
		/** initialize the max and min with first element */
		int max = arr[0];
		int min = arr[0];
		
		/** travese and find the maximum element */
		for(int i=0;i<arr.length;i++)
			if(arr[i]>max)
				max = arr[i];
		
		/** traverse and find the minimum elements */
		for(int i=0;i<arr.length;i++)
			if(arr[i]<min)
				min = arr[i];
		
		System.out.println("The Largest value in the array is "+max);
		
		System.out.println("The Smallest value in the array is "+min);
					

	}

}
