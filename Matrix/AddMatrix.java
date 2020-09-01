package Matrix;

import java.util.Scanner;

public class AddMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/** intialize the matrix */
		int a[][] = new int[3][3];
		int b[][] = new int[3][3];
		Scanner sc = new Scanner(System.in);
		int c[][] = new int[3][3];
		System.out.println("Enter elements of first matrix:");
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				a[i][j] = sc.nextInt();
			}
		}
		System.out.println("Enter the elements of second matrix:");
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				b[i][j] = sc.nextInt();
			}
		}
		/** add two matrix value and display the result */
		System.out.println("The sum of two matrix is :");
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				c[i][j] = a[i][j]+b[i][j];
				System.out.print(c[i][j]+"\t");
			}
			System.out.println();
		}
	}

}
