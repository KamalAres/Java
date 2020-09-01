package Matrix;

import java.util.Scanner;

public class UpperTriangleMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/** initial matrix */
		Scanner sc = new Scanner(System.in);
		int a[][] = new int[3][3];
		System.out.println("Enter the elements of Matrix: ");
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				a[i][j] = sc.nextInt();
					
			}
		}
		/** if row greater than coloumn index print 0 else print value */
		System.out.println("The upper triangle matrix is: ");
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				if(i>j)
					System.out.print("0 ");
				else
					System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}

	}

}
