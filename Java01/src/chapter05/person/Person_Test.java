package chapter05.person;
import chapter05.person.*;

public class Person_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person ps = new Person();
		ps.age = 40;
		ps.name = "James";
		ps.marry = true;
		ps.child = 3;
		
		System.out.println("이 사람의 나이 " + ps.age);
		System.out.println("이 사람의 이름 " + ps.name);
		System.out.println("이 사람의 결혼 여부 " + ps.marry);
		System.out.println("이 사람의 자녀 수 " + ps.child);
		
	}

}
