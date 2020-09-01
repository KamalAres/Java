package Matrix;

import java.util.Scanner;

public class EqualityMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		/** initial matrix declaration */
		int a[][] = new int[3][3];
		int b[][] = new int[3][3];
		
		System.out.println("Elements of first Matrix: ");
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				a[i][j] = sc.nextInt();
			}
		}
		System.out.println("Elements of second Matrix: ");
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				b[i][j] = sc.nextInt();
			}
		}
		/** calculate the row and coloumn length of both the matrix */
		boolean flag = true;
		int row1,col1,row2,col2;
		row1 = a.length;
		col1 = a[0].length;
		
		row2 = b.length;
		col2 = b[0].length;
		/** compare the two matrix are equal or not */
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				if(a[i][j]!=b[i][j])
				{
					/** if not break */
					flag = false;
					break;
				}
			}
		}
		if((row1==row2)&&(col1==col2)&&flag) {
			System.out.println("Matrix are equal");
		}
		else
			System.out.println("Matrix are not equal");

	}

}
