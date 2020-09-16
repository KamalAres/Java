package String;

import java.util.Scanner;

public class CharacterCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		/** getting the string */
		String name = sc.next();
		/** displaying the string length */
		System.out.println("The length of the String is "+name.length());
	}

}
