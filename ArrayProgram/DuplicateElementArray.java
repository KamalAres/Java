package ArrayProgram;
/** to find the duplicate element in the array */
public class DuplicateElementArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/** initial array */
		int arr[] = {1,2,3,2,7,8,8,3,4,4,5,5,6,6};
		System.out.println("Duplicate elements in array are: ");
		
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				/** if element found it is duplicate */
				if(arr[i]==arr[j]) {
					System.out.println(arr[j]);
					//arr[i]=-1;
				}
			}
		}

	}

}
