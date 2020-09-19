package Conversation;

import java.util.Scanner;

public class StringToObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/** enter the string: */
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String str = sc.next();
		/** assign the string to object */
		Object obj = str;
		
		System.out.println(obj);
	}

}
