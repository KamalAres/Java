package Conversation;

import java.util.Scanner;

public class StringToBoolean {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		/** Enter the string */
		System.out.println("Enter the string: ");
		String str = sc.next();
		/** converting string to boolean using parseBoolean method */
		Boolean b = Boolean.parseBoolean(str);
		
		System.out.println(b);
		/** converting string to boolean using valueOf method */
		b = Boolean.valueOf(str);
		
		System.out.println(b);

	}

}
