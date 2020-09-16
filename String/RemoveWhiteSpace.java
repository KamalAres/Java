package String;

import java.util.Scanner;

public class RemoveWhiteSpace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/** get the input string */
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String to remove white space");
		String str = sc.nextLine();
		/** replacing the space */
		System.out.println(str.replace(" ",""));

	}

}
