package Conversation;

import java.util.Scanner;

public class DecimalToBinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/** enter the decimal */
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the decimal value: ");
		int deci = sc.nextInt();
		/** converting decimal to binary using toBinaryString Method */
		System.out.println(Integer.toBinaryString(deci));
		System.out.println(toBinary(deci));

	}
	/** method to convert decimal to binary */
	static int toBinary(int decimal) {
		int val = 0,index=0;
		int[] binary = new int[8];
		while(decimal>0) {
			binary[index++] = decimal%2;
			decimal /=2;
		}
		for(int i=index-1;i>=0;i--)
			val = val*10+binary[i];
		return val;
	}

}
