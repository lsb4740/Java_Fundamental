package java_20210514;

import java.util.ArrayList;

public class MemberDemo {
	public static void main(String[] args) {
		MemberManager m = new MemberManager();
		m.insert("lsb4740","이수범0",10);
		m.insert("lsb4741","이수범1",20);
		m.insert("lsb4742","이수범2",30);
		m.insert("lsb4743","이수범3",40);

		ArrayList list = m.select();
		for(int i = 0; i<list.size();i++) {
			Member m2 = (Member)list.get(i);
			System.out.printf("%s, %s,%d %n", m2.getId(),m2.getName(),m2.getAge());
		}
			
	}
}
