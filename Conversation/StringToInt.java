package Conversation;

import java.util.Scanner;

public class StringToInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		/** enter a string */
		System.out.println("Enter the number: ");
		String num = sc.next();
		/** converting string to int using parseInt method */
		System.out.println(Integer.parseInt(num));
		/** converting string to int using valueOf method */
		System.out.println(Integer.valueOf(num));

	}

}
