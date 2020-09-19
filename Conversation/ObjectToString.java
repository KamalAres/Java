package Conversation;

import java.util.Scanner;

public class ObjectToString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		/** an object is created */
		ObjectToString e = new ObjectToString();
		/** the object is converted to string using toString method */
		String str = e.toString();
		
		System.out.println(e);
		/** the object is converted to string using valueOf method */
		str = String.valueOf(e);
		
		System.out.println(str);
	}

}
