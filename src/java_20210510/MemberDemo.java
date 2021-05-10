package java_20210510;

public class MemberDemo {
	public static void print(Member m) {
		
		String name = m.getName();
		String email = m.getEmail();
		String zipcode = m.getZipcode();
		String addr1 = m.getAddr1();
		String addr2 = m.getAddr2();
		int age = m.getAge();
		
		System.out.println(name);
		System.out.println(email);
		System.out.println(zipcode);
		System.out.println(addr1);
		System.out.println(addr2);
		System.out.println(age);
	}
	public static void main(String[] args) {
		Member m = new Member();
		m.setName("이수범");
		m.setEmail("lsb4740@gmail.com");
		m.setZipcode("09876");
		m.setAddr1("서울 영등포구 여의도동");
		m.setAddr2("롯데캐슬 아이비");
		m.setAge(25);		
		print(m); // => print(name, email, zipcode, addr1, addr2, age);
	}
}
