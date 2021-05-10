package java_20210507;


public class MethodDemo {
	public void print(int year, int month) {
		int[] monthArray = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		boolean isLeapYear = isLeapYear(year);
		if (isLeapYear) monthArray[1] = 29;
		int leapYearCount=0;
		for (int i = 1; i < year; i++) {
			if(isLeapYear) leapYearCount++;
		}
		int totalDay;
		totalDay = (year-1)*365 + leapYearCount + 1;
		int weekDayNum= (totalDay +1) %7;
		System.out.println("일\t월\t화\t수\t목\t금\t토");
		for (int i = 0; i <= (totalDay); i++) {
			System.out.print(" \t");
		}
		for (int i = 1; i <= monthArray[month-1]; i++) {
			System.out.print(i + "\t");
			if (weekDayNum% 7 == 0)
				System.out.println();
			weekDayNum++;
		}
	}

	public int[] ascending(int[] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length - (i + 1); j++) {
				if (array[j] > array[j + 1]) {
					int temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}
		}
		return array;
	}

	public boolean isLeapYear(int year) {
		return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
	}

	public int plus(int first, int second) { // first, second => 매개변수(Parameter)
		return first + second;
	}

	public static void main(String[] args) {
		MethodDemo m = new MethodDemo();
		int sum = m.plus(10, 20);
		System.out.println(sum); // 10,20 => 인자(Arguments)
		System.out.printf("%d\n", sum);

		boolean leapYear = m.isLeapYear(2100);
		System.out.printf("%s \n", leapYear);

		int[] test = { 10, 20, 1, 30, 4, 89, 100, 25 };
		int[] afterTest = m.ascending(test);
		for (int i = 0; i < afterTest.length; i++) {
			System.out.print(afterTest[i] + "\t");
		}
		System.out.println();
		System.out.println();
		System.out.println();
		m.print(2021, 2);
	}
}
