package Conversation;

import java.util.Calendar;
import java.util.Date;

public class DateToString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/** date from system */
		Date date = Calendar.getInstance().getTime();
		/** converting the date to string using toString method */
		System.out.println(date.toString());
		/** converting the date to string using format method */
		String d =String.format("%s", date);
		System.out.println(d);

	}

}
