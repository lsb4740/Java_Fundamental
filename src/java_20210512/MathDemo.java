package java_20210512;

public class MathDemo {
	public static void main(String[] args) {
		double d =Math.ceil(4.23);
		System.out.println(d);

		d = Math.floor(4.9);
		System.out.println(d);
		
		int i = (int)Math.round(4.2);
		System.out.println(i);
		
		d = Math.abs(-4.2);
		System.out.println(d);
		
		d = Math.max(10,20);
		System.out.println(d);
		
		d = Math.min(2.4, 1002.56);
		System.out.println(d);
		
		d = Math.sqrt(2);
		System.out.println(d);
		
		long l = (long)Math.pow(2, 3);
		System.out.println(l);
		
		d = Math.random();
		System.out.println(d);
		
		
	}
}
