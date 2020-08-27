package BasicProgram;

import java.util.Scanner;
/** Factorial class */
public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number :");
		int num = sc.nextInt();
		/** calling fact method to determin the factorial value */
		System.out.println("The factorial of the number "+num+" is "+fact(num));

	}
	/** factorial using recursion */
	public static int fact(int num) {
		if(num==0)
			return 1;
		else {
			return (num*fact(num-1));
		}
	}

}
