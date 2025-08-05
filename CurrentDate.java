package practical2;

import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;

public class CurrentDate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date date = new Date();
		   System.out.println("Current Date : "+ date);
		   int month = date.getMonth();
		   int year = date.getYear();
		   
		   Calendar calendar = Calendar.getInstance();
		   calendar.set(2007,Calendar.NOVEMBER,17);
		   Date d = calendar.getTime();
		   System.out.println("Date using Calendar:"+d);
		   

		   LocalDateTime currentDateTime = LocalDateTime.now();
		   System.out.println("Current DateTime : "+ currentDateTime);
	}

}
