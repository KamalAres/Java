package Conversation;

import java.util.Scanner;

public class StringToDouble {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/** enter the double value */
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter double value: ");
		String str = sc.next();
		/** converting string to double */ 
		double d = Double.parseDouble(str);
		System.out.println(d);

	}

}
