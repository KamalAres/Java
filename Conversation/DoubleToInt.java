package Conversation;

import java.util.Scanner;

public class DoubleToInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the double value: ");
		Double d = sc.nextDouble();
		int i = d.intValue();
		System.out.println(i);

	}

}
