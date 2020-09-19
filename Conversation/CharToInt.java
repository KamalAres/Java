package Conversation;

import java.util.Scanner;

public class CharToInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/** enter the character */
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the char: ");
		char c = sc.next().charAt(0);
		/** converting char to int as ascii */
		 int i = c;
		 System.out.println(i);
		 /** converting char to numeric value using getNumericValue */
		 System.out.println(Character.getNumericValue(c));
		 /** converting char to numeric value using Integer.parseInt method */
		 System.out.println(Integer.parseInt(String.valueOf(c)));

	}

}
