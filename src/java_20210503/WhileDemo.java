package java_20210503;

public class WhileDemo {
	public static void main(String[] args) {
		int sum = 0;
		int i = 1; // 초기값
		while (i <= 10) { // 조건
			sum += i;
			i++;// 증감
		}
		System.out.printf("1부터 10까지의 합은 %d 입니다.\n", sum);

		int j = 1;
		sum = 0;
		for (; j <= 10;) {
			sum += j;
			j++;
		}
		System.out.printf("1부터 10까지의 합은 %d 입니다.\n", sum);

//	while을 사용한 구구단 만들기

		int first = 1;
		while (first <= 10) {
			System.err.println(first + "단입니다");
			int second = 1;
			while (second <= 10) {
				System.out.printf("%dX%d:%d%n", first, second, first * second);
				second++;
			}
			first++;
		}
	}
}
