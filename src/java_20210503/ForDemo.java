package java_20210503;

public class ForDemo {
	public static void main(String[] args) {

		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			sum = sum + i;
		}
		System.out.printf("1부터 10까지의 합은 %d 입니다\n", sum);

		sum = 0;
		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 0) {
				sum = sum + i;
			}
		}
		System.out.printf("1부터 10까지 짝수의 합은 %d 입니다\n", sum);

		sum = 0;
		for (int i = 0; i <= 10; i += 2) {
			sum = sum + i;
		}
		System.out.printf("1부터 10까지 짝수의 합은 %d 입니다\n", sum);

		for (int first = 1; first <= 10; first++) {
			System.out.printf("%d단 입니다.\n", first);
			for (int second = 1; second <= 10; second++) {
				System.out.printf("%d X %d = %d \n", first, second, first * second);
			}
		}

//		프라임 넘버 구하기
//		1과 자기 자신밖에 안나뉘어지는 것들 의미
//		가장 적게 돌리는 방식을 찾기
		
		int highNum = 100;
		boolean primeCheck;
		int count = 0;
		int primeCount = 0;
		for (int i = 2; i <= highNum; i++) {
			primeCheck = true;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					primeCheck = false;
					break;
				}
				count++;
			}
			if (primeCheck) {
				primeCount++;
				System.out.print(i);
			}
		}
		System.out.println("소수 개수 :" + primeCount + " 실행횟수: " + count);

		primeCount = 0;
		count = 0;
		int counter = 0;
		
		for (int i = 2; i <= highNum; i++) {
			counter = 0;
			for (int j = 1; j <= i; j++) {
				if (i % j == 0) {
					counter++;
				}
				count++;
			}
			if (counter == 2) {
				primeCount++;
				System.out.print(i);
			}
		}
		System.out.println("소수 개수 :" + primeCount + " 실행횟수: " + count);
		

		count = 0;
		primeCount = 0;
		for (int i = 2; i <= highNum; i++) {
			primeCheck = true;
			for (int j = 2; j*j <= i; j++) {
				if (i % j == 0) {
					primeCheck = false;
					break;
				}
				count++;
			}
			if (primeCheck) {
				primeCount++;
				System.out.print(i);
			}
		}
		System.out.println("소수 개수 :" + primeCount + " 실행횟수: " + count);
	}
}
