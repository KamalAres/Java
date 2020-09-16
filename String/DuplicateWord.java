package String;

import java.util.Scanner;

public class DuplicateWord {
	public static void main(String[] args) {
		/** get input string */
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String str = sc.nextLine();
		int count;
		String dist = "";
		String[] arr = str.split(" ");
		/** printing the duplicate words */
		System.out.println("The Duplicate words in the string are: ");
 		for(int i=0;i<arr.length;i++) {
			count = 1;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i].equalsIgnoreCase(arr[j])) {
					count++;
					arr[j]="0";
				}
			}
			if(count>1&&arr[i]!="0") {
				System.out.println(arr[i]);
			}
			/*
			 * if(arr[i]!="0") dist += arr[i]+" ";
			 */
		}
		/* System.out.println(dist); */
	}

}
