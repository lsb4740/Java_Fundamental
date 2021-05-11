package java_20210511;

public class ChildDemo {
	public static void main(String[] args) {
		Child child = new Child("010-8639-4743",50.3,158.8);
		
		System.out.println(child.name);
		System.out.println(child.address);
		System.out.println(child.age);
		System.out.println(child.phone);
		System.out.println(child.weight);
		System.out.println(child.height);
		System.out.println();
		Child child2 = new Child("이수범","서울",30,"010-8639-4743",50.3,123.2);
		System.out.println(child2.name);
		System.out.println(child2.address);
		System.out.println(child2.age);
		System.out.println(child2.phone);
		System.out.println(child2.weight);
		System.out.println(child2.height);
	}
}
