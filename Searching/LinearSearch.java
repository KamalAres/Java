package Searching;

import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/** enter the size of the array */
		System.out.println("Enter the size of the array:");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		/** enter the elements of the array */
		System.out.println("Enter the elements of the array: ");
		int[] arr = new int[n];
		for(int i=0;i<n;i++)
			arr[i] = sc.nextInt();
		/** enter the key to search */
		System.out.println("Enter the key to search in the array: ");
		int key = sc.nextInt();
		int pos  = linearSearch(arr,key);
		if(pos!=-1)
			System.out.println("The element is present at position "+pos);
		else
			System.out.println("The element is not present in the array");

	}
	/** linear search */
	public static int linearSearch(int[] arr,int key) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==key)
				return i+1;
		}
		return -1;
	}

}
