package Conversation;

import java.util.Scanner;

public class LongToInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/** enter the integer */
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the integer: ");
		int i = sc.nextInt();
		/** converting int to long using Long class*/
		Long l = new Long(i);
		
		System.out.println(l);
		/** converting int to Long using valueOf method */
		l = Long.valueOf(i);
		
		System.out.println(l);

	}

}
