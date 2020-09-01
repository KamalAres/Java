package Matrix;

import java.util.Scanner;

public class IdentityMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		/** initial Matrix declaration */
		int a[][] = new int[3][3];
		System.out.println("Enter the Matrix:");
		for(int i=0;i<3;i++)
			for(int j=0;j<3;j++)
				a[i][j] = sc.nextInt();
		/** checking diagonal is 1 and others are 0 */
		boolean flag = true;
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				if((i==j)&&a[i][j]!=1)
				{
					flag = false;
					break;
				}
				if((i!=j)&&a[i][j]!=0) {
					flag = false;
					break;
				}
			}
		}
		if(flag)
			System.out.println("Identity Matrix");
		else
			System.out.println("Not Identity Matrix");

	}

}
