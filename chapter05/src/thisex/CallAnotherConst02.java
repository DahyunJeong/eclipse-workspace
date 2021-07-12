package thisex;

class Person02 {
	String name;
	int age;
	
	Person02() {
		this("이름 없음", 1);		//this를 이용해 Person(String, int)를 호출
	}							//this를 통해 다른 메소드 호출, 지금 this는 생성자에서 생성자 호출
	
	Person02(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	Person02(String name) {
		this.name = name;
	}
	
	Person02 returnItSelf() {
		return this;			//this 변환
	}
}

public class CallAnotherConst02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person02 noName = new Person02();
		System.out.println(noName.name);
		System.out.println(noName.age);
		System.out.println();
		
		Person02 yesName = new Person02("이름 있답", 10);
		System.out.println(yesName.name);
		System.out.println(yesName.age);
		System.out.println();
		
		Person02 p = noName.returnItSelf();
		System.out.println(p);
		System.out.println(noName);
		
		
	}

}
