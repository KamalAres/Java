package Conversation;

import java.util.Scanner;

public class FloatToString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		/** enter the floating point number */
		System.out.println("Enter a floating point value: ");
		float f = sc.nextFloat();
		/** converting float value to string using toString method */
		String str = Float.toString(f);
		System.out.println(str);
		/** converting float value to string using valueOf method */
		str = String.valueOf(f);
		System.out.println(str);

	}

}
