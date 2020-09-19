package Conversation;

import java.util.Scanner;

public class StringToLong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/** enter the long integer */
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a long integer: ");
		String num = sc.next();
		/** converting the string to long format */
		long l = Long.parseLong(num);
		System.out.println(l);

	}

}
