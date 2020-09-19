package Conversation;

import java.util.Scanner;

public class DecimalToHexadecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/** enter the decimal value */
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the decimal value: ");
		int deci = sc.nextInt();
		/** converting decimal to hexadecimal using toHexString method */
		System.out.println(Integer.toHexString(deci).toUpperCase());
		System.out.println(toHexa(deci));
		

	}
	/** converting decimal to hexadecimal method */
	static String toHexa(int dec) {
		char[] alp = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E'};
		String hex="";
		int rem;
		while(dec>0) {
			rem = dec%16;
			hex = alp[rem]+hex;
			dec /=16;
		}
		return hex;
	}

}
