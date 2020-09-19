package Conversation;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class StringToDate {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		/** initially enter the date as string in the specified format */
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String date = sc.next();
		/** conversion process of string to date */
		Date d1 = new SimpleDateFormat("dd/MM/yyyy").parse(date);
		date = sc.next();
		Date d2 = new SimpleDateFormat("dd-MMM-yyyy").parse(date);
		
		System.out.println(d1);
		System.out.println(d2);

	}

}
