package java_20210430;

public class SsnDemo {
	public static void main(String[] args) {
		int a1 = 9;
		int a2 = 7;
		int a3 = 0;
		int a4 = 9;
		int a5 = 2;
		int a6 = 9;

		int b1 = 1;
		int b2 = 2;
		int b3 = 1;
		int b4 = 3;
		int b5 = 6;
		int b6 = 1;
		int b7 = 6;

//		1. 각자리수를 2부터 9까지 곱하고 다시 2부터 5까지 곱해서 합을 구한다.
		int sum = a1 * 2 + a2 * 3 + a3 * 4 + a4 * 5 + a5 * 6 + a6 * 7 + b1 * 8 + b2 * 9 + b3 * 2 + b4 * 3 + b5 * 4
				+ b6 * 5;

//		2. 총합(sum)을 11로 나눈 나머지를 구한다.
		int remain = sum % 11;

//		3. 11에서 나머지를 뺀다.
		int calculation1 = 11 - remain;
//		remain = 11 - remain;
		
//		4. 3의결과를 10으로 나눈 나머지를 구한다.
		int lastNumber = calculation1 % 10;
//		remain %= remain  10;

//		5. 4의 결과와 마지막 숫자(b7)가 같으면 정상적인 주민번호, 그렇지 않으면
//		   비정상적인 주민번호 메세지를 출력한다.
		String validity = (b7 == lastNumber) ? "옳바른 주민번호" : "옳바르지않는 주민번호";
		System.out.println(validity + "입니다");

	}
}
