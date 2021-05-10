package java_20210507;

import java.util.*;

public class Calendar  {
	Scanner scanner = new Scanner(System.in);
	private int[] monthArray = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
	public static final int MONDAY = 1;
	public static final int TUESDAY = 2;
	public static final int WEDNESDAY = 3;
	public static final int THURSDAY = 4;
	public static final int FRIDAY = 5;
	public static final int SATURDAY = 6;
	public static final int SUNDAY = 0;
	

	public Calendar(int year) {
		this(year,0,0);
	}
	public Calendar(int year, int month) {
		this(year,month,0);
	}
	public Calendar(int year, int month, int day) {
		this(year,month,day)
	}

	private int leapYearCount(int year) {
		int count = 0;
		for (int i = 1; i < year; i++) {
			if (isLeapYear(i))
				count++;
		}
		return count;
	}

	private boolean isLeapYear(int year) {
		return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
	}

	private int getCount(int year, int month, int day) {
		int totalDays = (year - 1 - leapYearCount(year)) * 365 + leapYearCount(year) * 366 + day;
		change(year);
		for (int y = 1; y < month; y++) {
			totalDays += monthArray[y-1];
//			if (y == 1 || y == 3 || y == 5 || y == 7 || y == 8 || y == 10 || y == 12) {
//				totalDays = totalDays + 31;
//			} else if (y == 4 || y == 6 || y == 9 || y == 11) {
//				totalDays = totalDays + 30;
//			} else if (year % 4 == 0 && year % 100 != 0 && y == 2) {
//				totalDays = totalDays + 29;
//			} else if (year % 400 == 0 && y == 2) {
//				totalDays = totalDays + 29;
//			} else if (y == 2) {
//				totalDays = totalDays + 28;
//			}
		}
		return totalDays;
	}
//	윤년에 따라 2월 개수 바꿔주기
	private void change(int year) {
		if (isLeapYear(year))monthArray[1] = 29;
	}

//	요일 구하기
	public void print(int year, int month, int day) {
		String weekDayName = " ";
		int weekDayNum = getCount(year, month, day) % 7;
		if (weekDayNum == Calendar.MONDAY) {
			weekDayName = "월요일";
		} else if (weekDayNum == Calendar.TUESDAY) {
			weekDayName = "화요일";
		} else if (weekDayNum == Calendar.WEDNESDAY) {
			weekDayName = "수요일";
		} else if (weekDayNum == Calendar.THURSDAY) {
			weekDayName = "목요일";
		} else if (weekDayNum == Calendar.FRIDAY) {
			weekDayName = "금요일";
		} else if (weekDayNum == Calendar.SATURDAY) {
			weekDayName = "토요일";
		} else {
			weekDayName = "일요일";
		}

		System.out.println(year + "년 " + month + "월 " + day + "일은 " + weekDayName + "입니다");
	}

//	달력 만들기
	public void print(int year, int month) {
		System.out.println("\t\t"+year + "년 " + month + "월 달력입니다.");
		System.out.println();
		System.out.println("일\t월\t화\t수\t목\t금\t토");
		int weekDayNum = getCount(year, month, 1) % 7;
//		선생님 버젼
//		for (int i = 0; i < weekDayNum; i++) {
//			System.out.print("\t");
//		}
//		for (int i = 1; i <= monthArray[month - 1]; i++) {
//			System.out.print(i + "\t");
//			if (weekDayNum % 7 == 6)
//				System.out.println();
//			weekDayNum++;
//		}
//		마이 버젼
		for (int i =  1- weekDayNum; i <= monthArray[month - 1]; i++) {
			int check = i + weekDayNum;
			if (i > 0) {
				System.out.print(i + "\t");
				if (check % 7 == 0)
					System.out.println();
			} else {
				System.out.print(" \t");
			}
		}
		System.out.println();
		System.out.println();
	}

//	연도 달력 만들기
	public void print(int year) {
		for (int i = 1; i <= 12; i++) {
			print(year,i);
		}
	}

	public static void main(String[] args) {
		Calendar calendar = new Calendar();
		calendar.print(2024, 2, 29);
		calendar.print(2024,3,1);
		calendar.print(2024, 2);
//		calendar.print(2024);
	}
}
