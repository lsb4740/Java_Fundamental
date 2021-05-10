package java_20210504;

public class ArrayDemo {
	public static void main(String[] args) {
//		배열 선언, 생성
		int[] a = new int[4];

//		배열 할당
		a[0] = 100;
		a[1] = 200;
		a[2] = 300;
		a[3] = 400;

//		배열 출력
		for (int i = 0; i < a.length; i++) {
			int temp = a[i];
			System.out.println(temp);
		}

//		배열 선언, 생성, 할당
		int[] b = { 100, 200, 300, 400 };

//		배열 출력
		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]);

		}
		int[] monthArray = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		int month = 9;
		int day = 15;
		int totalDay =0;
		for (int i = 0; i < month-1; i++) {
			totalDay += monthArray[i];
		}
		totalDay += day;
		System.out.println(month+"월 "+day+ "일은 "+totalDay+"일입니다");
	}
}
