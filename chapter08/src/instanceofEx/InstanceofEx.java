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
	//��ӹ޴� ��� �ֵ��� ��ü Ÿ���̶�� �ǰ�..?
	
	public static void main(String[] args) {
		System.out.print("new Student() -> \t"); 
		print(new Student());	// Person p = new Student(); -> ����ȯ �� ��, ��ĳ����
		
		System.out.print("new Resercher() -> \t"); 
		print(new Resercher());	// Person p = new Resercher(); -> ��ĳ����
		
		System.out.print("new Professor() -> \t");
		print(new Professor());	// Person p = new Professor(); -> ��ĳ����
		
		// ����Ŭ������ ������ Ÿ���� ���� �ֱ� ������.. ��ӹ��� Ŭ�������� Ÿ���� �� ������ �ִٰ� ����..!
		
	}

}