package ArrayProgram;
/** to print the sum of array */
public class SumOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/** initial array */
		int arr[] = {1,2,3,4,5,6,7,8,9,10};
		/** initialize sum to 0 */
		int sum = 0;
		/** add every element to sum */
		for(int i=0;i<arr.length;i++)
			sum += arr[i];
		
		/** print the sum */
		System.out.println("The sum of the array is "+sum);

	}

}
