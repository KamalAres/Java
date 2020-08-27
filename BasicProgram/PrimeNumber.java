package BasicProgram;

import java.util.Scanner;
/** prime number class */
public class PrimeNumber {
	/** main method */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number to check prime or not:");
		int num = sc.nextInt();
		if(isPrime(num)) {
			System.out.println(num+" is a prime number");
		}
		else
			System.out.println(num+" is not a prime number");
		int start,end;
		System.out.println("Enter the starting number:");
		start = sc.nextInt();
		System.out.println("Enter tht ending number:");
		end = sc.nextInt();
		for(int i=start;i<=end;i++) {
			if(isPrime(i))
				System.out.println(i);
		}
	}
	/** isPrime method to check whether the number is prime or not */
	public static boolean isPrime(int num) {
		if(num>1) {
			/** Math.sqrt is used to optimize the time complexity */
			for(int i=2;i<=Math.sqrt(num);i++) {
				if(num%i==0)
					return false;
			}
			return true;
		}
		else
			return false;
	}

}
