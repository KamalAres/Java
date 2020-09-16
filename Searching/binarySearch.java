package Searching;

import java.util.Arrays;
import java.util.Scanner;

public class binarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/** enter the size of the array */
		System.out.println("Enter the size of the array: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		/** enter the elements of array */
		System.out.println("Enter the elements of the array: ");
		int[]  arr = new int[n];
		for(int i=0;i<n;i++)
			arr[i] = sc.nextInt();
		/** enter the key to search */
		System.out.println("Enter the key: ");
		int key = sc.nextInt();
		/** sort the array in order to perform binary search the array must be sorted */
		Arrays.sort(arr);
		int pos = binarySearch(arr,key);
		if(pos==-1)
			System.out.println("The element is not present in the array");
		else
			System.out.println("The key is found at the position "+pos);
	}
	/** binary search */
	public static int binarySearch(int[] arr,int key) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==key)
				return i+1; 
		}
		return -1;
	}

}
