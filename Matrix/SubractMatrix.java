package Matrix;

import java.util.Scanner;

public class SubractMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/** initialize the matrix */
		int a[][] = new int[3][3];
		int b[][] = new int[3][3];
		int c[][] = new int[3][3];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the elements of first Matrix: ");
		for(int i=0;i<3;i++)
			for(int j=0;j<3;j++)
				a[i][j] = sc.nextInt();
		System.out.println("Enter the elements of second Matrix: ");
		for(int i=0;i<3;i++)
			for(int j=0;j<3;j++)
				b[i][j] = sc.nextInt();
		/** subract the matrix and display the result */
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				c[i][j] = a[i][j] - b[i][j];
				System.out.print(c[i][j]+"\t");
			}
			System.out.println();
		}

	}

}
