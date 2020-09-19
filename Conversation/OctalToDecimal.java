package Conversation;

import java.util.Scanner;

public class OctalToDecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		/** enter the octal value */
		System.out.println("Enter the Octal value: ");
		int oct = sc.nextInt();
		/** converting octal to decimal using parseInt method */
		System.out.println(Integer.parseUnsignedInt(String.valueOf(oct), 8));
		System.out.println(octToDecimal(oct));

	}
	/** method to convert octal to decimal */
	static int octToDecimal(int octal) {
		int val=0;
		int n=0;
		while(octal>0) {
			val += (octal%10)*Math.pow(8, n++);
			octal /=10;
			
		}
		return val;
	}

}
