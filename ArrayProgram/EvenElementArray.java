package ArrayProgram;
/** Program to display even and odd elements */
public class EvenElementArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/** initial array */
		int arr[] = {1,2,3,4,5,6,7,8,9};
		
		/** array elements of even position */
		System.out.println("Array elements at even position");
		for(int i=1;i<arr.length;i=i+2)
			System.out.print(arr[i]+" ");
		System.out.println();
		
		/** array elements of odd position */
		System.out.println("Array elements at odd position");
		for(int i=0;i<arr.length;i=i+2)
			System.out.print(arr[i]+" ");

	}

}
