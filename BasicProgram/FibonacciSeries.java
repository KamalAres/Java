package BasicProgram;

import java.util.Scanner;
/** This program is to find fibonacci series for given limit using recursion */
public class FibonacciSeries {
	/** main method */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int limit;
		System.out.print("Enter the limit for fibonacci series:");
		Scanner sc = new Scanner(System.in);
		limit = sc.nextInt();
		/** printing the initial value */
		System.out.print(num1+" "+num2);
		/** reducing the limit for matching the output of initial condition */
		Fibonacci(limit-2);
		}

	/** static variable to use in static methods */
	static int num1=0,num2=1,sum=0;
	/** fibonacci method */
	public static void Fibonacci(int limit) {
		if (limit>0) {
			sum = num1 + num2;
			System.out.print(" "+sum);
			num1 = num2;
			num2 = sum;
			/** recursive call to the method */
			Fibonacci(limit-1);
		}
	}

}
