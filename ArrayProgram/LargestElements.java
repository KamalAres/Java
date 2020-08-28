package ArrayProgram;
/** To find Largest Element in array */
public class LargestElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/** initial array */
		int arr[] = {2,4,3,1,5,6,7,9,8,10};
		
		System.out.println("The Third Largest Element in the array: "+Largest(arr,3));
		System.out.println("The second Largest Element in the array is "+Largest(arr,2));
		System.out.println("The First Largest Element in the array is "+Largest(arr,1));
		
		System.out.println();
		System.out.println("The Third Smallest Element in the array: "+Smallest(arr,3));
		System.out.println("The second Smallest Element in the array is "+Smallest(arr,2));
		System.out.println("The First Smallest Element in the array is "+Smallest(arr,1));

	}
	/** method to sort and return largest element **/
	public static int Largest(int arr[],int pos) {
		/** temp to swap */
		int temp;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println("The arrray");
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");
		System.out.println();
		return arr[arr.length-pos];
	}
	/** method to sort and return smallest element in array */
	public static int Smallest(int arr[],int pos) {
		/** temp to swap */
		int temp;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println("The arrray");
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");
		System.out.println();
		return arr[pos-1];
	}

}
