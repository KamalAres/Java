package Conversation;

import java.util.Scanner;

public class BinaryToDecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/** enter the binary value */
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the binary value: ");
		String binary = sc.next();
		/** converting binary to decimal */
		int deci = Integer.parseInt(binary, 2);
		System.out.println(deci);
		
		System.out.println(binaryToDecimal(Integer.valueOf(binary)));
		

	}/** converting binary to decimal */
	 static int binaryToDecimal(int bin) {
		int val = 0;
		int n = 0;
		int temp;
		while(bin>0) {
			temp = bin%10;
			val += temp*Math.pow(2, n);
			bin /=10;
			n++;
		}
		return val;
	}

}
