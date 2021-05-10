package java_20210510.aa;
import java_20210510.Admin;
public class AdminDemo {
	public static void main(String[] args) {
		Admin a = new Admin("lsb4740","123","lsb4740@gmail.com",20);
		
		System.out.println(a.getId());
		System.out.println(a.getPwd());
		System.out.println(a.getEmail());
		System.out.println(a.getLevel());
		
		Admin a1
		= new Admin();
		a1.setId("lsb4740");
		a1.setPwd("123");
		a1.setEmail("lsb4740@gmail.com");
		a1.setLevel(20); 
	}	
}
