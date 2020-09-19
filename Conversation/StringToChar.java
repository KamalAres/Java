package Conversation;

import java.util.Scanner;

public class StringToChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/** Enter the String */
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String str = sc.next();
		/** converting string to char using charAt method */
		char c = str.charAt(0);
		System.out.println(c);
		/** converting string to char using toCharArray method */
		char[] arr = str.toCharArray();
		
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");
	}

}
