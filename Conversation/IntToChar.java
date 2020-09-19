package Conversation;

import java.util.Scanner;

public class IntToChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/** enter the integer */
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the integer: ");
		int i = sc.nextInt();
		/** converting to character using typecasting */
		char c = (char)i;
		System.out.println(c);

	}

}
