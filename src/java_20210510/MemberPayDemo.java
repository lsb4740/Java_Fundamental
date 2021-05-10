package java_20210510;

public class MemberPayDemo {
	public static void main(String[] args) {
		MemberPay m = new MemberPay();
		m.setSeq(1);
		m.setGroup(1);
		m.setName("자바 일주일만에 완성하기");
		m.setPrice(50000);
		m.setValid(false);
		m.setStatus("진행중");
		m.setSdate("2021-04-15");
		m.setEdate("2021-11-30");
		m.setRegdate("2021-30-20");
		
		System.out.println(m.getSeq());
		System.out.println(m.getGroup());
		System.out.println(m.getName());
		System.out.println(m.getPrice());
		System.out.println(m.isValid());
		System.out.println(m.getStatus());
		System.out.println(m.getSdate());
		System.out.println(m.getEdate());
		System.out.println(m.getRegdate());
		
	}
}
