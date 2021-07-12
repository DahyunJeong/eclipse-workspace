package instanceofEx;

class Person {	}
class Student extends Person { }
class Resercher extends Person { }
class Professor extends Resercher { }

public class InstanceofEx {
	static void print(Person p) {
		if(p instanceof Person) System.out.print("	Person");
		if(p instanceof Student) System.out.print("	Student");
		if(p instanceof Resercher) System.out.print("	Resercher");
		if(p instanceof Professor) System.out.print("	Professor");
		System.out.println();
	}
	//상속받는 모든 애들의 객체 타입이라는 건가..?
	
	public static void main(String[] args) {
		System.out.print("new Student() -> \t"); 
		print(new Student());	// Person p = new Student(); -> 형변환 된 것, 업캐스팅
		
		System.out.print("new Resercher() -> \t"); 
		print(new Resercher());	// Person p = new Resercher(); -> 업캐스팅
		
		System.out.print("new Professor() -> \t");
		print(new Professor());	// Person p = new Professor(); -> 업캐스팅
		
		// 슈퍼클래스의 데이터 타입을 갖고 있기 때문에.. 상속받은 클래스들의 타입을 다 가지고 있다고 찍힘..!
		
	}

}
