package java_20210430;

public class OperatorDemo {
	public static void main(String[] args) {
		int a = 10,  b = 22;
		int c = 0;
		double d = 0.0;
		
		c = a+b;
		System.out.println(c);
		
		c= a-b;
		System.out.println(c);
		
		c= a*b;
		System.out.println(c);
		
		c= b/a;
		System.out.println(c);
		
		d= (double)b/a;
		System.out.println(d);
		
		c=b%a;
		System.out.println(c);
		
//		복합대입 연산자
		a += b; // a= a+b;
		System.out.println(a);
		
//		증감 연산자
		a++;
		++b;
		System.out.println(a);
		System.out.println(b);
		
//		대입후 증가
		a= 10; // a를 10으로 초기화
		c = a++; //c = a; a++;과 동일
		System.out.println(c);
		
//		증가후 대입 
		a = 10;
		c = ++a; //a++; c = a;과 동일
		System.out.println(c);
		
//		비교 연산자
		a = 10; b= 20;
		boolean isSuccess = a>b;
		System.out.println(isSuccess);
		if(isSuccess) {
			System.out.println(a+"이 "+b+"보다 크다");
		}else {
			System.out.println(a+"이 "+b+"보다 작다");
		}
		d = 10.0;
		isSuccess = a==d;
		System.out.println(isSuccess);
		
//		논리연산자
		a = 10;
		b = 20;
//		A && B => A가 false이면 B를 연산하지 않는다 (Short Circuit)
//		A || B => A가 true이면 B를 연산하지 않는다 (Short Circuit)
		isSuccess = (a==b) || (++a == b++);
		System.out.println(isSuccess);
		System.out.println(a);
		System.out.println(b);
		
		
	}
}
