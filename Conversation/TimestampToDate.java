package Conversation;

import java.sql.Timestamp;
import java.util.Date;

public class TimestampToDate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/** input as timestamp */
		Timestamp ts = new Timestamp(System.currentTimeMillis());
		/** converting timestamp to date */
		Date date = new Date(ts.getTime());
		System.out.println(date);
		/** converting timestamp to date */
		date = ts;
		
		System.out.println(date);
	}

}
