package String;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/** get user input string */
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String str = sc.next();
		boolean flag = true;
		/** compare the string from first and last check if both are same */
		for(int i=0;i<str.length()/2;i++) {
			if(str.charAt(i)!=str.charAt(str.length()-i-1))
			{
				flag = false;
				break;
			}
		}
		if(flag)
			System.out.println(str+" is a palindrome");
		else
			System.out.println(str+" is not a palindrome");

	}

}
