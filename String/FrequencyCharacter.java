package String;

import java.util.Scanner;

public class FrequencyCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/** get input string */
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String str = sc.nextLine();
		char[] string = str.toCharArray();
		int[] freq = new int[str.length()];
		/** calculating the frequency of each character */
		for(int i=0;i<string.length;i++) {
			freq[i]=1;
			for(int j=i+1;j<string.length;j++) {
				if(string[i]==string[j]&&string[i]!='0') {
					freq[i]++;
					string[j]='0';
				}
			}
		}/** printing each character frequency */
		System.out.println("The frequency of each character in the string is: ");
		int count=0;
		for(int i=0;i<freq.length;i++) {
			if(string[i]!=' '&&string[i]!='0') {
				count++;
				System.out.println(string[i]+" - "+freq[i]);
			}
		}
		System.out.println(count);

	}

}
