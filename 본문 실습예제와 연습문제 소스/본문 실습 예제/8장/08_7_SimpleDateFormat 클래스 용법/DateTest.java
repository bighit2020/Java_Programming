package ch8.ex6;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateTest {

	public static void main(String[] args) {
		Date date=new Date();
		Calendar cal=Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd");
		
		int day=cal.get(Calendar.DAY_OF_YEAR);
		///System.out.println(day);
		//System.out.println(sdf(new Date()));
		//System.out.println(date.);
		System.out.println(sdf.format(cal.getTime()));
		
		
	}

}
