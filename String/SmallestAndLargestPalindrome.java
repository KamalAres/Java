package String;

import java.util.Scanner;

public class SmallestAndLargestPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/** enter the string */
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String[] word = sc.nextLine().split(" ");
		/** initial assignment of the string */
		int min=0,max=0;
		String smallPali="",largePali="";
		for(int i=0;i<word.length;i++) {
			if(isPalindrome(word[i])) {
				min = word[i].length();
				max = word[i].length();
				smallPali = word[i];
				largePali = word[i];
				break;
			}
		}
		/** compute smallest palindrome and largest palindrome in string */
		for(int i=0;i<word.length;i++) {
			if(word[i].length()<min&&isPalindrome(word[i])) {
				min = word[i].length();
				smallPali = word[i];
			}
			if(word[i].length()>max&&isPalindrome(word[i])) {
				max = word[i].length();
				largePali = word[i];
			}
		}
		System.out.println("The smallest palindrome is "+smallPali);
		System.out.println("The largest palindrome is "+largePali);
		
		
	}
	public static boolean isPalindrome(String str) {
		for(int i=0;i<str.length()/2;i++) {
			if(str.charAt(i)!=str.charAt(str.length()-i-1)) {
				return false;
			}
		}
		return true;
	}

}
