package rent.ex6.base;

import java.util.Calendar;
/*
 * �ڽ� Ŭ�������� ���������� ���Ǵ� ����(�Ӽ�)�̳� ����� 
 * �����Ѵ�.
 */
public class Base {
	
	
	
	//��ȸ�� �������� �ð� ������ �����ϴ� �޼ҵ�
	public String showTime(){
		String date=null;
		String time=null;
		Calendar cal=Calendar.getInstance();
		
		int hour=cal.get(Calendar.HOUR);
		int min=cal.get(Calendar.MINUTE);
		int sec=cal.get(Calendar.SECOND);
		
		int year=cal.get(Calendar.YEAR);
		int month=cal.get(Calendar.MONTH)+1;
		int day=cal.get(Calendar.DATE);
		
		date=year+ "-"+ month + "-"+day;
		time=hour +":"+min+":"+sec;
		return date+ " " +time;
	}
}

