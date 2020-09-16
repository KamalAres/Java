package String;

import java.util.Scanner;

public class FindMaxMinOccurence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/** get input string */
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String str = sc.nextLine();
		char[] arr = str.toCharArray();
		/** assign the first character to both maxchar and minchar */
		char minChar=str.charAt(0),maxChar=str.charAt(0);
		int[] freq = new int[str.length()];
		/** frequency count */
		for(int i=0;i<arr.length;i++) {
			freq[i] = 1;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]&&arr[i]!=' '&&arr[i]!='0') {
					freq[i] = freq[i]+1;
					arr[j] = '0';
				}
			}
		}
		/** assign the minimum and maximum occurring character in the string */
		int min=freq[0],max=freq[0];
		for(int i=0;i<freq.length;i++) {
			if(min>freq[i]&&arr[i]!='0') {
				min = freq[i];
				minChar = arr[i];
			}
			if(max<freq[i]) {
				max = freq[i];
				maxChar = arr[i];
			}
		}
		System.out.println("The minimum occurring character in "+str+" is "+minChar);
		System.out.println("The maximum occurring character in "+str+" is "+maxChar);
	}

}
