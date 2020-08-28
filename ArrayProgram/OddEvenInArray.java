package ArrayProgram;

public class OddEvenInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,2,3,4,5,6,7,8,9,10};
		
		System.out.println("Odd elements in array: ");
		for(int i=0;i<arr.length;i++)
			if(arr[i]%2!=0)
				System.out.print(arr[i]+" ");
		
		System.out.println();
		
		System.out.println("Even elements in array: ");
		for(int i=0;i<arr.length;i++)
			if(arr[i]%2==0)
				System.out.print(arr[i]+" ");
		

	}

}
