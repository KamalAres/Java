package Conversation;

import java.util.Scanner;

public class IntToLong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the long value: ");
		Long l = sc.nextLong();
		
		int i = l.intValue();
		
		System.out.println(i);

	}

}
