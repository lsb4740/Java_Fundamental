package java_20210504;

public class PrimitiveReferenceDiff {
	public static void main(String[] args) {
		int a = 10;
//		Primitive 변수를 활당하면 값이 할당됨
		int b = a;
		b = 30;
		System.out.println(a);
		System.out.println(b);
		
		int[] test = {10,20,30,40};
//		int[] third = {50,60,70,80};
//		Reference 변수를 할당하면 같은 객체를 참조함
		int[] temp = test;
		int[] third = temp;
		test = third;
		
		System.out.printf("test[0] : %d, temp[0] : %d, third[0] : %d%n",test[0],temp[0],third[0]);

		System.out.printf("test[1] : %d, temp[1] : %d, third[1] : %d%n ",test[1],temp[1],third[1]);
		
		temp[2]=3000;
		
		System.out.printf("test[2] : %d, temp[2] : %d, third[2] : %d%n ",test[2],temp[2],third[2]);
		
		System.out.println("temp"+temp);
		System.out.println("test"+test);
		System.out.println("third"+third);
	}
}
