package String;

import java.util.Scanner;

public class MostRepeatedWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/** get input string */
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String: ");
		/** get string array using split method */
		String[] str = sc.nextLine().split(" ");
		int max=0,count;
		
		String maxWord="";
		/** computing the maximum occuring word */
		for(int i=0;i<str.length;i++) {
			count=1;
			for(int j=i+1;j<str.length;j++) {
				if(str[i].equalsIgnoreCase(str[j])) {
					count++;
					str[j] = "0";
				}
			}
			if(count>max) {
				max = count;
				maxWord = str[i];
			}
		}
		System.out.println("The most occurring word is "+maxWord);

	}

}
