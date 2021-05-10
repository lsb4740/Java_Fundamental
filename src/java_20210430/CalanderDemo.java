package java_20210430;

public class CalanderDemo {
	public static void main(String[] args) {
		int year = 2021;
		int month = 4;
		int day = 30;
		int leapYearCount = 0;
		int totalDays = 0;
		String weekDayName = " ";

		for (int i = 1; i < year; i++) {
			if (i % 4 == 0 && i % 100 != 0) {
				leapYearCount++;
			} else if (i % 400 == 0) {
				leapYearCount++;
			}
		}

		totalDays = (year - 1 - leapYearCount) * 365 + leapYearCount * 366 + day;
		
		for (int y = 1; y < month; y++) {
			if (y == 1 || y == 3 || y == 5 || y == 7 || y == 8 || y == 10 || y == 12) {
				totalDays = totalDays + 31;
			} else if (y == 4 || y == 6 || y == 9 || y == 11) {
				totalDays = totalDays + 30;
			} else if (year % 4 == 0 && year % 100 != 0 && y == 2) {
				totalDays = totalDays + 29;
			} else if (year % 400 == 0 && y == 2) {
				totalDays = totalDays + 29;
			} else if (y == 2) {
				totalDays = totalDays + 28;
			}
		}
		int weekDayNum = totalDays % 7;
		
		if (weekDayNum == 1) {
			weekDayName = "월요일";
		} else if (weekDayNum == 2) {
			weekDayName = "화요일";
		} else if (weekDayNum == 3) {
			weekDayName = "수요일";
		} else if (weekDayNum == 4) {
			weekDayName = "목요일";
		} else if (weekDayNum == 5) {
			weekDayName = "금요일";
		} else if (weekDayNum == 6) {
			weekDayName = "토요일";
		} else {
			weekDayName = "일요일";
		}
		
//		switch (weekDayNum) {
//		case 1 : weekDayName = "월요일"; break;
//		case 2 : weekDayName = "화요일"; break;
//		case 3 : weekDayName = "수요일"; break;
//		case 4 : weekDayName = "목요일"; break;
//		case 5 : weekDayName = "금요일"; break;
//		case 6 : weekDayName = "토요일"; break;
//		case 0 : weekDayName = "일요일"; break;
//		
//		}
		System.out.println(year + "년 " + month + "월 " + day + "일은 " + weekDayName + "입니다");
	}
}
