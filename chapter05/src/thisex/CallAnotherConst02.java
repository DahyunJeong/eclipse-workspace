package thisex;

class Person02 {
	String name;
	int age;
	
	Person02() {
		this("�̸� ����", 1);		//this�� �̿��� Person(String, int)�� ȣ��
	}							//this�� ���� �ٸ� �޼ҵ� ȣ��, ���� this�� �����ڿ��� ������ ȣ��
	
	Person02(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	Person02(String name) {
		this.name = name;
	}
	
	Person02 returnItSelf() {
		return this;			//this ��ȯ
	}
}

public class CallAnotherConst02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person02 noName = new Person02();
		System.out.println(noName.name);
		System.out.println(noName.age);
		System.out.println();
		
		Person02 yesName = new Person02("�̸� �ִ�", 10);
		System.out.println(yesName.name);
		System.out.println(yesName.age);
		System.out.println();
		
		Person02 p = noName.returnItSelf();
		System.out.println(p);
		System.out.println(noName);
		
		
	}

}
