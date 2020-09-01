package Matrix;

import java.util.Scanner;

public class SparseMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/** initial Matrix declaration */
		int a[][] = new int[3][3];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the elements of Matrix: ");
		for(int i=0;i<3;i++)
			for(int j=0;j<3;j++)
				a[i][j] = sc.nextInt();
		/** calculate the count 0 in Matrix */
		int row=a.length,col=a[0].length;
		int count = 0;
		int size = row*col;
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				if(a[i][j]==0)
					count++;
			}
		}
		/** if count greater than size/2 is sparse matrix else not */
		if(count>(size/2))
			System.out.println("Sparse Matrix");
		else
			System.out.println("Not a Sparse Matrix");

	}

}
