package java_20210510;

public class VariableArgumentDemo {
	public long sum(int... temp) {
		long sum = 0;
		for (int i=0; i < temp.length;i++) {
			sum += temp[i];
		}
		return sum;
	}
	public static void main(String[] args) {
		VariableArgumentDemo v = new VariableArgumentDemo();
		long s1 = v.sum(10,20);
		System.out.println(s1);
		s1 = v.sum(80,90,75,95);
		System.out.println(s1);
	}
}
