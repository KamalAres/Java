package String;

import java.util.Scanner;

public class SeperateCharacterFromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/** get input string */
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String str = sc.next();
		/** seperating the character from string */
		for(int i=0;i<str.length();i++) {
			System.out.print(str.charAt(i)+" ");
		}

	}

}
