package java_20210512;

import java.util.ArrayList;

public class WrapperDemo {
	public static void main(String[] args) {
//		ctl + shift + o => Auto Import
//		자바 1.4 이전 버전에서는 Primitive Data Type을 Collection에
//		저장할 수 없었기 때문에 Primitive Data Type을 객체화 할 수 있는
//		Wrapper Class으로 변환하여 저장해야 했다.
//		아래와 같이 1을 저장할 수 없음.
		ArrayList list = new ArrayList();
//		list.add(1);
		list.add(Integer.valueOf(1));
		
//		1. Primitive Data Type => Wrapper Class(생성자 이용)
		Integer i1 = Integer.valueOf(10);
		Integer i2 = Integer.valueOf(20);
		
		int i3 = i1.intValue();
		int i4 = i2.intValue();
		int i5 = i3 + i4;
		
//		숫자로 구성된 String => Primitive Data Type
//		Integer.parseInt("10");
		String s1 = "12345";
		int i6 = Integer.parseInt(s1);
//		4. Auto-Boxing : Primitive Data Type => Wrapper Class
		Integer i7 = 100;
		Integer i8 = 200;
//		5. Auto-Unboxing : Wrapper Class => Primitive Data Type
		int i9 = i7+i8;
	}
}
