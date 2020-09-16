package String;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/** get input string */
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String str = sc.nextLine();
		String rev = "";
		/** traverse from last and store it in rev */
		for(int i=str.length()-1;i>=0;i--) {
			rev += str.charAt(i);
		}
		System.out.println("The reverse of "+str+" is "+rev);

	}

}
