package ch8.ex7a;

public class CalendarTest1 {    
	  int calcDays(int year, int month) {
		  int daysOfMonth[] = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 }; 
		  
	   if (month == 2) { 
	      if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) { 
	        return (29);  
	      }
	   }
	   return (daysOfMonth[month - 1]);
	 }

	  //해당 월의 1일의 요일 구하기
	 int calcFirstDay(int year, int month) {
	   int totalDays;

	   totalDays = (year * 365);
	   totalDays += (year - 1) / 4;
	   totalDays -= (year - 1) / 100;
	   totalDays += (year - 1) / 400;

	  for (int i = 1; i < month; i++) {
	    totalDays += calcDays(year, i);
	   }

	  return (totalDays % 7);   
	 }

	  void display(int _year, int _month, int _daysOfMonth, int _firstDay) {
	   int daysOfWeek = 0;

	  System.out.println("        " + _year + "년 " + _month + "월");  
	  // System.out.println("Sun Mon Tue Wed Thu Fri Sat");
	  System.out.println("  일   월   화   수   목   금   토");
	   System.out.println("---------------------------");
	  for (int i = 0; i < _firstDay; i++) {
	   System.out.print("    ");
	   daysOfWeek++;
	   }

	  for (int i = 1; i <= _daysOfMonth; i++) {
	   if (i < 10) {
	     System.out.print("  " + i + " ");
	    } else {
	     System.out.print(" " + i + " ");
	    }

	   daysOfWeek++; 
	    if (daysOfWeek%7==0) {
	     System.out.println();
	     daysOfWeek = 0;
	    }
	   }
	  }

	 public static void main(String[] args) {
	    int year, month, daysOfMonth,firstDay ;
	    CalendarTest1 cal=new CalendarTest1();

	    if(args.length != 2) { 
	      // System.out.println("[사용법] java CalendarTest 년 월");
	       year = 2015;
	       month = 3;
	    }else {
	       year = Integer.parseInt(args[0]); 
	       month = Integer.parseInt(args[1]);
	    }
	   
	    daysOfMonth = cal.calcDays(year, month);
	    firstDay = cal.calcFirstDay(year, month);

	   cal.display(year, month, daysOfMonth, firstDay);
	}
}
