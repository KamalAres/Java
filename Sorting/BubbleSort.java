package Sorting;

import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		/** enter the size of the array */
		System.out.println("Enter the size of the array: ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		/** enter the array elements */
		System.out.println("Enter the elements of the array: ");
		for(int i=0;i<n;i++)
			arr[i] = sc.nextInt();
		/** perform bubble sort */
		bubbleSort(arr);
		System.out.println("The array after bubble sorting: ");
		for(int i=0;i<n;i++)
			System.out.print(arr[i]+" ");

	}
	/** performing bubble sorting */
	public static void bubbleSort(int[] arr) {
		int n = arr.length;
		int temp = 0;
		for(int i=0;i<n;i++) {
			for(int j=1;j<(n-i);j++) {
				if(arr[j-1]>arr[j]) {
					temp = arr[j-1];
					arr[j-1] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}

}
