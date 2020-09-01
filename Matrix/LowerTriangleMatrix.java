package Matrix;

import java.util.Scanner;

public class LowerTriangleMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		/** initial matrix declaration */
		int a[][] = new int[3][3];
		System.out.println("Enter the elements of the matrix:");
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				a[i][j] = sc.nextInt();
			}
			
		}
		/** print the matrix value that is less than j if not print 0 */
		int row=a.length,col=a[0].length;
		if(row==col) {
			for(int i=0;i<3;i++) {
				for(int j=0;j<3;j++) {
					if(j>i)
						System.out.print("0 ");
					else
						System.out.print(a[i][j]+" ");
				}
				System.out.println();
			}
		}
		else
			System.out.println("Matrix should be square matrix");

	}

}
