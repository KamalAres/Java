package String;

import java.util.Scanner;

public class DivideStringEqually {

	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		Scanner sc = new Scanner(System.in);
		/** enter the string */
		System.out.println("Enter the string : ");
		String str = sc.next();
		int len=str.length(),temp=0;
		/** enter the number to divide the string */
		System.out.println("Enter the number to divide: ");
		int n = sc.nextInt();
		String equalstr[] = new String[n];
		int div = len/n;
		/** check whether the number can be divided by number */
		if(len%n!=0)
			System.out.println("The string cannot be divided equally");
		else {
			/** assign the divided string to the new array of string */
			for(int i=0;i<len;i=i+div) {
				equalstr[temp++] = str.substring(i,i+div);
				//temp++;
				
			}
		}
		System.out.println(n+" equal parts of string are: ");
		for(int i=0;i<n;i++)
			System.out.println(equalstr[i]);

	}

}
