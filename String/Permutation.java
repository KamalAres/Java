package String;

import java.util.Scanner;

public class Permutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**get the input string */
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String to generate all permutation:");
		String str = sc.next();
		int len = str.length();
		/** calling the method generate permutation */
		generatePermutaion(str,0,len);
	}
	public static void generatePermutaion(String str,int start,int end) {
		/** printing the string if start == end-1 */
		if (start==end-1) {
			System.out.println(str);
		}
		else {
			for(int i=start;i<end;i++) {
				/** swapping the string and assigning */
				str = swapString(str,start,i);
				/** Recursive call to the method to generate all permutation */
				generatePermutaion(str,start+1,end);
				/** swapping the String */
				str = swapString(str,start,i);
			}
		}
	}
	/** method to swap the string */
	public static String swapString(String a,int i,int j) {
		char b[] = a.toCharArray();
		char ch;
		ch = b[i];
		b[i] = b[j];
		b[j] = ch;
		return String.valueOf(b);
	}

}
