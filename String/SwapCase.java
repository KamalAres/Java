package String;

import java.util.Scanner;

public class SwapCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/** get the input string */
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String str = sc.next();
		/*
		for(int i=0;i<str.length();i++) {
			if(Character.isLowerCase(str.charAt(i)))
				str = str.substring(0,i)+Character.toUpperCase(str.charAt(i))+str.substring(i+1);
			else
				str = str.substring(0,i)+Character.toLowerCase(str.charAt(i))+str.substring(i+1);
		}
		*/
		/** swapping the string to upper and lower case */
		System.out.println(swapCase(str));

	}
	/** method to swap the character to upper and lower case */
	public static String swapCase(String str) {
		StringBuilder sb = new StringBuilder(str);
		for(int i=0;i<sb.length();i++) {
			if (Character.isLowerCase(sb.charAt(i)))
				sb.setCharAt(i, Character.toUpperCase(str.charAt(i)));
			else
				sb.setCharAt(i, Character.toLowerCase(str.charAt(i)));
		}
		//System.out.println(sb);
		return sb.toString();
	}

}
