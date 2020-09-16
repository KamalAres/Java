package String;

import java.util.Scanner;

public class SubString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		/** enter the string */
		System.out.println("Enter the String: ");
		String str = sc.next();
		/** calculate the length */
		int len = str.length();
		/** subset array length len*(len+1)/2 */
		String sub[] = new String[len*(len+1)/2];
		int temp=0;
		/** substring calculation */
		for(int i=0;i<len;i++) {
			for(int j=i;j<len;j++) {
				sub[temp++] = str.substring(i,j+1);
			}
		}
		System.out.println("The substring of the given string is: ");
		for(int i=0;i<sub.length;i++)
		{
			System.out.print(sub[i]+" ");
		}

	}

}
