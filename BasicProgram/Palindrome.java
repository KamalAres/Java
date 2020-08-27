package BasicProgram;

import java.util.Objects;
import java.util.Scanner;
/** palindrome using stringbuilder class */
public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the string/number to check whether palindrome or not:");
		StringBuilder original = new StringBuilder(sc.next());
		StringBuilder reverse = new StringBuilder("");
		/** to get the length of the original string */
		int length = original.length();
		/** here we are reversing the string and appending the string */
		for(int i = length-1;i>=0;i--) {
			reverse.append(original.charAt(i));
		}
		/** inorder to compare the string must convert to toString before */
		if(original.toString().equals(reverse.toString()))
			System.out.println(original+" is a palindrome");
		else
			System.out.println(original+" is not a palindrome");

	}

}
