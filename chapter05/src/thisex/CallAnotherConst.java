package thisex;

class Person {
	String name;
	int age;
	
	Person() {
		this("�̸� ����", 1);		//this�� �̿��� Person(String, int)�� ȣ��
	}							//this�� ���� �ٸ� �޼ҵ� ȣ��, ���� this�� �����ڿ��� ������ ȣ��
	
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
		
		Person yesName = new Person("�̸� �ִ�", 10);
		System.out.println(yesName.name);
		System.out.println(yesName.age);
		
	}

}
