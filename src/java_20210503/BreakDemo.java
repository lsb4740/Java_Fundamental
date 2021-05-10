package java_20210503;

public class BreakDemo {

	public static void main(String[] args) {
		int sum = 0;
		aa: 
		for (int i = 1; i <= 10; i++) {
			if (i == 6)
				break aa;
			sum += i;
		}
		System.out.println("합은 : " + sum);

		outter: 
		for (int i = 2; i < +9; i++) {
			inner:
			for (int j = 1; j <= 9; j++) {
				if (i ==4 && j ==6) break inner;
				System.out.printf("%d x %d : %d %n ", i,j,i*j);
			}
		}
		
		
	}

}
