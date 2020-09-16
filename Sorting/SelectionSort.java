package Sorting;

import java.util.Scanner;

public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		/** enter the size of the array */
		System.out.println("Enter the size of the array: ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		/** enter the elements of array */
		System.out.println("Enter the elements of the array: ");
		for(int i=0;i<n;i++)
			arr[i] = sc.nextInt();
		/** perform selection sort */
		selectionSort(arr);
		System.out.println("The array after selection sorting: ");
		for(int i=0;i<n;i++)
			System.out.print(arr[i]+" ");

	}
	/** performing selection sorting */
	public static void selectionSort(int[] arr) {
		int n=arr.length;
		int temp = 0;
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				if(arr[i]>arr[j]) {
					temp = arr[i];
					arr[i] =arr[j];
					arr[j] = temp;
				}
			}
		}
	}

}
