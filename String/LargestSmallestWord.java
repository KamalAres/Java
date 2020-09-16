package String;

import java.util.Scanner;

public class LargestSmallestWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/** get input string */
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String str = sc.nextLine();
		/** split the string with space */ 
		String[] word = str.split(" ");
		/** initialize the initial parameters */
		int min=word[0].length(),max=word[0].length();
		String smallWord=word[0],largeWord=word[0];
		/** computing the smallest and largest word */
		for(int i=0;i<word.length;i++) {
			if(word[i].length()<min) {
				min = word[i].length();
				smallWord = word[i];
				
			}
			if(word[i].length()>max) {
				max = word[i].length();
				largeWord = word[i];
			}
		}
		System.out.println("The smallest word in the "+str+" is "+smallWord);
		System.out.println("The largest word in the "+str+" is "+largeWord);

	}

}
