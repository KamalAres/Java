package Conversation;

import java.util.Scanner;

public class BooleanToString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		/** enter a boolean value */
		System.out.println("Enter the boolean: ");
		Boolean b = sc.nextBoolean();
		
		/** converting boolean to string valueOf method */
		String str = String.valueOf(b);
		System.out.println(str);
		/** converting boolean to string using toString method */
		str = Boolean.toString(b);
		System.out.println(str);
	}

}
