package java_20210430;

public class CastingDemo {
	public static void main(String[] args) {
//		Overflow 발생하여 컴파일 에러
//		byte b1 = 129;
		
//		서킷 발생으로 인한 값 변화(권장하지 않음)
		byte b1 = (byte)129;
		System.out.println(b1);
		
//		Cut 발생 (소수점 이하 숫자들 생략)
		int i1 = (int)129.25;
		System.out.println(i1);
		
//		Auto-Casting (자동 형변환) (double에서 float으로 타입 변화)
		double d1 = 123.4f;
		System.out.println(d1);
		
		byte b2 = 10;
		byte b3 = 20;
//		산술 연산자 '+'의 반환값은 int로 나온다 / 그래서 byte 타입으로 주면 오류가 뜬다
//		byte b4 = b2+b3;
		byte b4 = (byte)(b2+b3);
		int b5 = b2+b3;
		System.out.println(b4);
		System.out.println(b5);
		
//		위치에 따라 '+'는 연산자나 연결연산자의 역할을 한다
//		1. 문자열 + 숫자 => 문자열
//		2. 숫자 + 문자열 => 문자열
//		3. 문자열 + 문자열 => 문자열
		String str1 = "abc"+1+2;
		String str2 = "abc"+(1+2);
		String str3 = 1+2+"abc";
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
	}
}
