package String;

import java.util.Scanner;

public class TotalVowelConsonant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String: ");
		/** input the string */
		String name = sc.next();
		int vCount=0,cCount=0;
		/** string to lower case */
		name = name.toLowerCase();
		/** compare the vowel present and increment count */
		for(int i=0;i<name.length();i++) {
			if(name.charAt(i)=='a'||name.charAt(i)=='e'||name.charAt(i)=='i'||name.charAt(i)=='o'||name.charAt(i)=='u')
				vCount++;
			else if(name.charAt(i)>='a'&&name.charAt(i)<='z')
				cCount++;
		
		}	
		System.out.println("Number of vowels "+vCount);
		System.out.println("Number of consonants "+cCount);
				
				
		
	}

}
