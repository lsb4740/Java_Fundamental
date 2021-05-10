package java_20210506;

public class Customer {
//	Instance 변수 (static이 안붙어있으면 Instance 변수다)
	String name; // Referal
	String email; // Referal
	String phone; // Referal
	int age; 
	double balance;
	boolean released;
//	Class 변수 
//	앞에 static이 있으면 클래스 변수로서 메인에서 전체적으로 고정된 값을 유지한다. c1,c2,c3 etc.. 각자 값을 넣어줘도 마지막에 저장된 값만 갖고있는다.
	static double interestRate;
//	static final은 무조건 대문자로 쓰이는게 관례 / 고정된 값을 저장하여 수정이 불가하다.
	static final String BANKNAME = "신한은행";
}
