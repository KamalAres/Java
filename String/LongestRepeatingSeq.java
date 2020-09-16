package String;



import java.util.Arrays;
import java.util.Scanner;

public class LongestRepeatingSeq {

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
		/** to get alphabetical string order */
		Arrays.sort(sub);
		System.out.println("The substring of the given string is: ");
		for(int i=0;i<sub.length;i++)
		{
			System.out.print(sub[i]+" ");
		}
		System.out.println();
		/** to get max length of repeating string */
		int max = 0;
		String temp_str = "";
		/** calculating maximum repeating longest string */
		for(int i=0;i<sub.length;i++) {
			for(int j=i+1;j<sub.length;j++) {
				if(sub[i].equals(sub[j])&&sub[j].length()>max) 
					{
						temp_str = sub[j];
						max = sub[j].length();
					
				}
			}
			
		}
		
		
		System.out.println("The longest repeating sequence of string is "+temp_str);

	}

}
