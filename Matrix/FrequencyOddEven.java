package Matrix;

import java.util.Scanner;

public class FrequencyOddEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		/** initial matrix declaration */
		int a[][] = new int[3][3];
		/** counting the even number and odd number */	
		System.out.println("Enter the elements of the Matrix: ");
		int oddCount=0,evenCount=0;
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				a[i][j] = sc.nextInt();
				if(a[i][j]%2==0)
					evenCount++;
				else
					oddCount++;
		
			}
		}
		System.out.println("The odd number frequency in matrix is "+oddCount);
		System.out.println("The even number frequency in matrix is "+evenCount);
		

	}

}
