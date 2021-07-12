package constructor;

public class Person {
	String name;
	float height;
	float weight;
	
	public Person() {	//기본 생성자, 생략 가넝
	//클래스 내에 다른 생성자가 있을 때는 생략x, 명시시켜 줘야 함	
	}
	
	public Person(String pname) {
		name = pname;
	}
	
	public Person(String pname, float pheight, float pweight) {
		name = pname;
		height = pheight;
		weight = pweight;
	}
	
}
