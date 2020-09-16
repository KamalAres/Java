package String;

import java.util.Scanner;

public class DuplicateChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/** get input string */
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string: ");
		StringBuilder str = new StringBuilder(sc.nextLine());
		int count;
		/** convert string character array */
		//char[] string = str.toCharArray();
		System.out.println("The Duplicate characters in the "+str+" is ");
		/** to print duplicate character in the string */
		for(int i=0;i<str.length();i++) {
			count = 1;
			for(int j=i+1;j<str.length();j++) {
				if(str.charAt(i)==str.charAt(j)&&str.charAt(i)!='0')
				{
					count++;
					str.replace(j, j+1,"0");
				}
			}
			if(count>1 && str.charAt(i)!='0')
				System.out.println(str.charAt(i));
		}

	}

}
