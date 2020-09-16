package String;

import java.util.Scanner;

public class StringRotationAnother {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/** get input string */
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String1: ");
		String str1 = sc.next();
		System.out.println("Enter the String2: ");
		String str2 = sc.next();
		/** concatenate the string 1 and string1 and check string2 is present in the result */
		System.out.println(str1+str1);
		if((str1+str1).contains(str2))
			System.out.println("Yes "+str2+" is rotation of "+str1);
		else
			System.out.println("No "+str2+" is not rotation of "+str1);

	}

}
