package java_20210513;

public class StringDemo {
	public static void main(String[] args) {
		char[] c = {'h','e','l','l','o'};
		String str = new String(c);
		System.out.println(str);
//		index는 0부터 시작
		char c1 = str.charAt(1);
		System.out.println(c1);
//		문자열 연결하는 메서드
		str = str.concat("123");
		System.out.println(str);
		
		if(str.endsWith("zip")) {
			System.out.println("ZIP FILE");
		}else if(str.endsWith("doc")) {
			System.out.println("MS WORD FILE");
		}else {
			System.out.println("FILE");
		}
		String url = new String("http://www.naver.com");
		String path = new String("/news/board.do?id=123&cat=1");
//		startsWith(String msg) => msg 문자열로 시작하면 true;
//		그렇지 않으면 false
		if(path.startsWith("/news")) {
			System.out.println("News Page");
		} else if (path.startsWith("/sports")) {
			System.out.println("Sports Page");
		}else {
			System.out.println("Page 404");
		}
		
//		equalsIgnoreCase() => 대소문자 구분하지 않고 비교
//		trim() => 공백을 제거
		String m1 = new String("hello ").trim();
		String m2 = new String("HELLO");
		if(m1.equalsIgnoreCase(m2)) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
		String m3 = new String("안녕하세요.");
		byte[] b = m3.getBytes();
		System.out.println(b.length);
		
		String m4 = new String("111111-1111118");
		int index = m4.indexOf("-");
		System.out.println(index);
		
		String m5 = new String("a.b.c.zip");
		int lastIndexOf = m5.lastIndexOf(".");
		System.out.println(lastIndexOf);
		
//		System.out.println(m4.substring(index,lastIndexOf));
		System.out.println(m4.substring(0,m4.indexOf("-")));
		System.out.println(m4.substring(m4.indexOf("-")+1));
		
		System.out.println(m5.substring(0, m5.lastIndexOf(".")));
		System.out.println(m5.substring(m5.lastIndexOf(".")+1));
		
		String m6 = new String("010-1234-5678");
		System.out.println(m6.substring(0,m6.indexOf("-")));
		System.out.println(m6.substring(m6.indexOf("-")+1,m6.lastIndexOf("-")));
		System.out.println(m6.substring(m6.lastIndexOf("-")+1));
		
		int a1 = Integer.parseInt(m4.substring(0,1));
		String m7 = 123+"";
		String m8 = String.valueOf(123);
		String m9 = m6.replaceAll("-","_");
		System.out.println(m9);
		
		String m10 = new String("hello");
		String m11 = m10.toUpperCase();
		System.out.println(m11);
		String m12 = m11.toLowerCase();
		System.out.println(m12);
		
		String[] temp = m6.split("-");
		for(String value : temp) {
			System.out.println(value);
		}
		
		
	}
}