package ArrayProgram;
/** Reverse array elements */
public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/** initial array */
		int arr[] = {1,2,3,4,5,6,7,8,9};
		//int rev[] = new int[arr.length];
		/** printing the original array from index 0 */
		System.out.println("Original array:");
		for(int i=0;i<arr.length;i++)
				System.out.print(arr[i]+" ");
		System.out.println();
		/** printing the reverse array from last index */
		System.out.println("Reversed Array:");
		for(int i=arr.length-1;i>=0;i--)
			System.out.print(arr[i]+" ");

	}

}
