package String;

import java.util.Scanner;

public class NumberOfWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/** get input string */
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the series of strings: ");
		/** count number of words in the string */
		String[] str = sc.nextLine().split(" ");
		System.out.println("The number of words in the text is "+str.length);
	}

}
