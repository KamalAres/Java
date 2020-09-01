package Matrix;

import java.util.Scanner;

public class MultiplyMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/** initialize the matrix */
		int a[][] = new int[3][3];
		int b[][] = new int[3][3];
		int c[][] = new int[3][3];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the elements of first Matrix:");
		for(int i=0;i<3;i++)
			for(int j=0;j<3;j++)
				a[i][j] = sc.nextInt();

		
		System.out.println("Enter the elements of second Matrix:");
		for(int i=0;i<3;i++)
			for(int j=0;j<3;j++)
				b[i][j] = sc.nextInt();
		/** multiplication process */
		System.out.println("The multiplication of two Matrix is : ");
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				/** always initialise c[i][j]=0 */
				c[i][j] = 0;
				for(int k=0;k<3;k++) {
					/** multiply the row and coloumn of i and j  and add to c[i][j]*/
					c[i][j] += a[i][k]*b[k][j];
				}
				System.out.print(c[i][j]+"\t");
			}
			System.out.println();
		}
}
	

}
