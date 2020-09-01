package Matrix;

import java.util.Scanner;

public class TransposeMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		/** initial Matrix declaration */
		int a[][] = new int[3][3];
		System.out.println("Enter the elements of Matrix: ");
		for(int i=0;i<3;i++)
			for(int j=0;j<3;j++)
				a[i][j] = sc.nextInt();
		/** transposing row to column */
		System.out.println("The transpose of Matrix is : ");
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(a[j][i]+" ");
			}
			System.out.println();
		}
		

	}

}
