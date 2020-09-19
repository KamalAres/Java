package Conversation;

import java.util.Scanner;

public class StringToFloat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		/** enter a floating point value */
		System.out.println("Enter a floating point value: ");
		String deci = sc.next();
		/** converting String to float using parseFloat method */
		float f = Float.parseFloat(deci);
		System.out.println(f);

	}

}
