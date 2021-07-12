package inheritance5;

class A {
	public A() {
		System.out.println("생성자 A");
	}
	
	public A(int x) {
		System.out.println("매개변수 생성자 A: " + x);
	}
	
	public A(int x, int y) {
		System.out.println("매개변수 생성자 2개 A");
	}
}

class B extends A {
	public B() {
		super(3);
		System.out.println("생성자 B");
	}
	public B(int x) {
	//	super(x);
		super(10, 20);
		System.out.println("매개변수 생성자 B: " + x);
	}
}

public class ConstructorEx03 {

	public static void main(String[] args) {
		B b = new B(5);
		B bb = new B();
	}

}
