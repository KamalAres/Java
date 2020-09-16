package String;

import java.util.Scanner;

public class SwapWithoutTemp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/** get input string */
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first string: ");
		String str1 = sc.next();
		System.out.println("Enter the second string: ");
		String str2 = sc.next();
		/** swapping the string without using temproary variable */
		str1 = str1+str2;
		str2 = str1.substring(0,(str1.length()-str2.length()));
		str1 = str1.substring(str2.length());
		
		System.out.println("The first string is "+str1);
		System.out.println("The second string is "+str2);

	}

}
