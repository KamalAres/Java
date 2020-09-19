package Conversation;

import java.util.Scanner;

public class HexaToDecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/** enter the hexadecimal value */
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter hexadecimal value: ");
		String hexa = sc.next();
		/** converting hexadecimal to decimal using parse Int method */
		System.out.println(Integer.parseUnsignedInt(hexa, 16));
		System.out.println(toHexa(hexa));

	}
	/** converting hexadecimal to decimal method */
	static int toHexa(String hex) {
		String alphabets = "0123456789ABCDEF";
		char c;
		int n=0;
		int digit,val=0;
		for(int i=hex.length()-1;i>=0;i--) {
			c = hex.charAt(i);
			digit = alphabets.indexOf(c);
			val += digit*Math.pow(16, n++);
		}
		return val;
	}

}
