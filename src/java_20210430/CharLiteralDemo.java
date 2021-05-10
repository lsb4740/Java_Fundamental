package java_20210430;

public class CharLiteralDemo {
	public static void main(String[] args) {
//		char 리터럴 => 문자 표현법
		char c1 = '이';
		char c2 = '수';
		char c3 = '범';
		System.out.print(c1);
		System.out.print(c2);
		System.out.println(c3);
		System.out.println();
		
//		char 리터럴 => 유니코드 표현법
		char c4 = '\uc774';
		char c5 = '\uc218';
		char c6 = '\ubc94';
		System.out.print(c4);
		System.out.print(c5);
		System.out.println(c6);
		System.out.println();
		
//		char 리터럴 => 아스키코드 표현법
		char c7 = 48;
		char c8 = 65;
		char c9 = 97;		
		System.out.println(c7);
		System.out.println(c8);
		System.out.println(c9);
		System.out.println();
		
//		문자중에 사용할 수 없는 문자는 '과 \  but "는 사용 가능
//		사용하기 위해서는 \를 앞에 붙여야한다
		char c10 = '\''; 
		char c11 = '\\';
		char c12 = '"';
		System.out.println(c10);
		System.out.println(c11);
		System.out.println(c12);
		System.out.println();
		
//		파일 경로를 추가하기 위해서는 각 \마다 추가적으로 \를 붙여줘야한다.
		String path = "C:\\Users\\user\\eclipse-workspace\\Java_Fundamental";
		System.out.println(path);
				
//		특수문자 \t 와 \n
		System.out.print("안녕하세요.\n저는 이수범입니다.\n잘 부탁드립니다.\n");
		System.out.println("아이디\t\t이름\t지역");
		System.out.println("lsb4740\t\t이수범\t서울");
	}
}
