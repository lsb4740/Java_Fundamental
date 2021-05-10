package java_20210507;

public class OverLoadingDemo {
//	OverLoadingDemo 클래스에서는 print() 메서드를 4가지로 오버로딩
//	Overloading의 작성 규칙은
//	1. 같은 클래스 내에서
//	2. 메서드 이름은 같아야한다.
//	3. 매개변수 개수가 같으면 서로 다른 자료형으로 구현
//	4. 매개변수 개수가 달라야한다.
//	5. 접근한정자와 반환형은 같거나 달라도 무방한다.
	
	public void print(String str) {
		System.out.println(str);
	}
	public void print(int i) {
		System.out.println(i);
	}
	public void print(double d) {
		System.out.println(d);
	}
	public void print(boolean b) {
		System.out.println(b);
	}
	public static void main(String[] args) {
		OverLoadingDemo demo = new OverLoadingDemo();
		demo.print("이수범");
		demo.print(10);
		demo.print(true);
		demo.print(42.34);
	}
}
