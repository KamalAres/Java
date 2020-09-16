package Sorting;

import java.util.Scanner;

public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		/** enter the size of the array */
		System.out.println("Enter the size of the array: " );
		int n = sc.nextInt();
		int[] arr = new int[n];
		/** enter the elements of the array */
		System.out.println("Enter the elements of the array: ");
		for(int i=0;i<n;i++)
			arr[i] = sc.nextInt();
		/** perform insertion sort */
		insertionSort(arr);
		System.out.println("The array after insertion sorting: ");
		for(int i=0;i<n;i++)
			System.out.print(arr[i]+" ");

	}
	/** performing insertion sorting */
	public static void insertionSort(int[] arr) {
		int n = arr.length;
		int key;
		int i;
		for(int j=1;j<n;j++) {
			key = arr[j];
			i = j-1;
			while((i>-1)&&arr[i]>key) {
				arr[i+1] = arr[i];
				i--;
			}
			arr[i+1] = key;
		}
	}

}
