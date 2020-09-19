package Conversation;

import java.util.Scanner;

public class IntToString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/** enter the integer */
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the an integer: ");
		int num = sc.nextInt();
		/** converting int to string using valueOf method */
		System.out.println(String.valueOf(num));
		/** converting int to string using toString method */
		System.out.println(Integer.toString(num));
		/** converting int to string using String.format method */
		System.out.println(String.format("%d",num));

	}

}
