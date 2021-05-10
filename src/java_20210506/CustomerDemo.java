package java_20210506;

public class CustomerDemo {
	public static void main(String[] args) {
		Customer c1 = new Customer();
		c1.name = "이수범";
		c1.age = 25;
		c1.email = "lsb4740@gmail.com";
		c1.phone = "010-8639-4743";
		c1.balance = 1_000_000;
		c1.released = false;
//		클래스 변수(static 변수)는 클래스 이름으로 접근하는 것이 관례
//		변수로도 접근 가능하나 권장하지 않음 예) c1.interestRate = 6.2;
		Customer.interestRate = 6.2;
//		static final 변수여서 값의 변경이 불가능하다.
//		Customer.BANKNAME ="국민은행"; // 에러가 뜬다
		System.out.printf("%s, %d, %s, %s, %f, %s\n",
				c1.name, c1.age, c1.email, c1.phone, c1.balance, c1.released);

		Customer c2 = new Customer();
		c2.name = "홍길동";
		c2.age = 30;
		c2.email = "qwer1234@gmail.com";
		c2.phone = "010-1234-4321";
		c2.balance = 50_000_000_000_000l;
		c2.released = true;
		Customer.interestRate = 8.2;
		System.out.printf("%s, %d, %s, %s, %f, %s\n",
				c2.name, c2.age, c2.email, c2.phone, c2.balance, c2.released);

		Customer c3 = c2;
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.printf("%s, %s\n", c2.name,c3.name);
		System.out.printf("%f\n", Customer.interestRate);
		
		
	}
}
