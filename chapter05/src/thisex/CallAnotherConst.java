package thisex;

class Person {
	String name;
	int age;
	
	Person() {
		this("이름 없음", 1);		//this를 이용해 Person(String, int)를 호출
	}							//this를 통해 다른 메소드 호출, 지금 this는 생성자에서 생성자 호출
	
	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	Person(String name) {
		this.name = name;
	}
}

public class CallAnotherConst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person noName = new Person();
		System.out.println(noName.name);
		System.out.println(noName.age);
		
		Person yesName = new Person("이름 있답", 10);
		System.out.println(yesName.name);
		System.out.println(yesName.age);
		
	}

}
