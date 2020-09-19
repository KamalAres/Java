package Conversation;

import java.util.Scanner;

public class DecimalToOctal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**  enter the decimal value */
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Decimal value: ");
		int deci = sc.nextInt();
		/** convert decimal to octal using toOctalString method */
		System.out.println(Integer.toOctalString(deci));
		System.out.println(toOctal(deci));

	}
	/** method to convert decimal to octal */
	static String toOctal(int dec) {
		char[] oct = {'0','1','2','3','4','5','6','7'};
		String val="";
		while(dec>0) {
			val = oct[dec%8]+val;
			dec /= 8;
		}
		return val;
	}

}
