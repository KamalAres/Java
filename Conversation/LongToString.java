package Conversation;

import java.util.Scanner;

public class LongToString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		/** enter the long integer */
		System.out.println("Enter a long integer: ");
		long l = sc.nextLong();
		/** converting the long integer to string using valueOf method  */
		String str = String.valueOf(l);
		System.out.println(str);
		/** converting the long integer string using toString method */
		str = Long.toString(l);
		System.out.println(str);

	}

}
