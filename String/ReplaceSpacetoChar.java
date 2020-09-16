package String;

import java.util.Scanner;

public class ReplaceSpacetoChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/** get the user input */
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String str = sc.nextLine();
		/** create an array with the split condition of space */
		String[] arr = str.split(" ");
		/** join the array with specified character */
		str = String.join("-", arr);
		System.out.println(str);

	}

}
