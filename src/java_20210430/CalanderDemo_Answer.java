package java_20210430;

public class CalanderDemo_Answer {
	public static void main(String[] args) {
		int year = 2024;
		int month = 5;
		int day = 4;

//		2020년까지 총일수
		int totalCount = 365 * (year - 1) 
				+ (year - 1) / 4 // 2020년까지 윤년 (4의배수)
				- (year - 1) / 100 // 2020년까지 100의 배수는 제외
				+ (year - 1) / 400; // 2020년까지 400의 배수는 추가

//		2021년도의 1월, 2월, 3월의 합을 구한다.
//		totalCount += 31 + 28 + 31;
		int[] monthArray = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		boolean isLeapYear = year%4==0 && year%100!=0 || year%400==0;
		if(isLeapYear) monthArray[1] = 29;
		for(int i = 0; i <month-1;i++) {
			totalCount += monthArray[i];
		}
		
		
//		2021년도 4월의 일수를 더한다.
		totalCount += day;

//		7로 나눈 나머지를 구하여 요일을 구한다
		int dayOfWeek = totalCount % 7;
		String message = " ";
//		if (dayOfWeek == 1) {
//			message = "월요일";
//		} else if (dayOfWeek == 2) {
//			message = "화요일";
//		} else if (dayOfWeek == 3) {
//			message = "수요일";
//		} else if (dayOfWeek == 4) {
//			message = "목요일";
//		} else if (dayOfWeek == 5) {
//			message = "금요일";
//		} else if (dayOfWeek == 6) {
//			message = "토요일";
//		} else if (dayOfWeek == 0) {
//			message = "일요일";
//		}
		
//		switch의 수식은 char, byte, short, int 자료형만 사용된다
		switch (/*수식*/dayOfWeek % 7) {
		case 1 : message = "월요일"; break; // break를 생략하면 맞는 조건을 찾아도 밑에 수식들을 체크한다.
		case 2 : message = "화요일"; break;
		case 3 : message = "수요일"; break;
		case 4 : message = "목요일"; break;
		case 5 : message = "금요일"; break;
		case 6 : message = "토요일"; break;
		case 0 : message = "일요일"; break;
		default : break; // default문은 필요가 없을 시 생략 가능
		
		}
		System.out.printf("%d년 %d월 %d일은 %s 입니다.",
				year, month, day, message);
	}
}
