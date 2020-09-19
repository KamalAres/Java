package Conversation;

import java.util.Scanner;

public class DoubleToString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		/** enter the value in double */
		System.out.println("Enter the double value: ");
		double d = sc.nextDouble();
		/** converting double to string using valueOf method */
		String str = String.valueOf(d);
		System.out.println(str);
		/** converting double to string using toString method */
		str = Double.toString(d);
		System.out.println(str);

	}

}
