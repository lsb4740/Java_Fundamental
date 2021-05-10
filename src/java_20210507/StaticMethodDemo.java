package java_20210507;


public class StaticMethodDemo {
	String name; //Instance Variable
	static double interestRate; //Static Variable
	public void m1() { //Instance Method
		System.out.println("Instance method m1() 호출");
	}
	public void m2() {
//		instance method에서는
//		모든 변수를 사용하고, 모든 메서드를 호출할 수 있음
		this.name = "이수범"; //this. => 자기자신 인스턴스
		StaticMethodDemo.interestRate = 3.4;
		this.m1();
		StaticMethodDemo.m3();
	}
	public static void m3() { //Static Method
		System.out.println("Static method m3() 호출");
	}
	public static void m4() {
//		static method에서는 static변수와 static 메서드만 사용할 수 잇다
//		name = "이수범";
		interestRate = 3.4;
//		m1();
		m3();
	}
	public static void main(String[] args) {
		StaticMethodDemo smd = new StaticMethodDemo();
		m3();
		m4();
		interestRate = 4.3;
		smd.name = "홍길동";
		smd.m1();
	}
}
