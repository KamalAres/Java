package Conversation;

import java.util.Scanner;

public class IntToDouble {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/** enter the integer */
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the integer: ");
		int i = sc.nextInt();
		/** convert int to double using double class */
		Double d = new Double(i);
		System.out.println(d);
		/** converting int to double using valueOf method */
		Double D = Double.valueOf(i);
		
		System.out.println(D);

	}

}
