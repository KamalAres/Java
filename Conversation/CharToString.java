package Conversation;

import java.util.Scanner;

public class CharToString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/** enter the character */
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the character: ");
		char c = sc.next().charAt(0);
		/** convert the character to string */
		String str = String.valueOf(c);
		System.out.println(str);
		/** converting the character to string using toString method */
		str = Character.toString(c);
		System.out.println(str);
		
		
		

	}

}
