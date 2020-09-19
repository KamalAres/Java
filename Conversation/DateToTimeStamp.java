package Conversation;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateToTimeStamp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/** Date as input */
		Date date = new Date();
		/** converting the date to time stamp */
		Timestamp ts = new Timestamp(date.getTime());
		System.out.println(ts);
		/** modifying the date to required time format */
		SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
		System.out.println(format.format(ts));

	}

}
