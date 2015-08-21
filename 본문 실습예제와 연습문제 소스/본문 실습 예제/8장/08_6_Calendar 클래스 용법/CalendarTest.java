package ch8.ex6;

  import java.util.Calendar;

  public class CalendarTest {
	public static void main ( String [ ] args){

			//static 메소드는  미리 존재하는 객체에 접근 하는 데 사용된다.
			Calendar cal = Calendar.getInstance();
			
			 int hour = cal.get( Calendar.HOUR );
			 int min = cal.get( Calendar.MINUTE );
			 int sec = cal.get( Calendar.SECOND );

			 int year  = cal.get( Calendar.YEAR );
			 int month = cal.get( Calendar.MONTH ) + 1;
			 int day = cal.get( Calendar.DATE );

			System.out.println(  "현재 날짜는 >" +  year + "년"+  month  + "월" + day+"일" );
			System.out.println(  "현재 시간은 >" +  hour + "시 "+ min + "분" + sec+"초" );
	}
  }

