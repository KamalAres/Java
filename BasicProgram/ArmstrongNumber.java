package BasicProgram;

import java.util.Scanner;
/** armstrong number */
public class ArmstrongNumber {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int num = sc.nextInt();
		int temp,sum=0,rem;
		/** assigning temproary variable */
		temp = num;
		while(num>0) {
			/** fetching the last value of the number */
			rem = num % 10;
			/** cubing the last value */
			sum += (rem*rem*rem);
			/** reducing the last digit */
			num /= 10;
		}
		if (temp == sum)
			System.out.println(temp+" is a armstrong number");
		else
			System.out.println(temp+" is not a armstrong number");

	}

}
