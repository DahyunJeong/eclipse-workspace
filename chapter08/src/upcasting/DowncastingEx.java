package upcasting;

public class DowncastingEx {

	public static void main(String[] args) {

		Person p = new Student("����");	//��ĳ����
		Student s;
		s = (Student) p;				//�ٿ�ĳ����(�ڷ��� �ݵ�� ���)
/*		
		Student ss;
		Person pp = new Person("�ɳ�");	//�ٿ�ĳ���� ���ؼ��� ���� ��ü�� �����߸� �ٿ�ĳ���� �����Ѱ�? => Yes!!
		ss = (Student) pp;				//�ٿ�ĳ����(�ڷ��� �ݵ�� ���)
		System.out.println("pp: " + pp.name);
		*/
		
		System.out.println("p: " + p.name);
		System.out.println("s: " + s.name);
		s.grade = "A";
		
		
		s.name = "����";
		System.out.println("p: " + p.name);
		System.out.println("s: " + s.name);
		
	//------------------------------------------------------------------	
		Person ps;
		Student sd = new Student("��");	//��
		ps = sd;						//��ĳ����
		
		sd = (Student)ps;				//�ٿ�ĳ����
		System.out.println("ps: " + ps.name);
		System.out.println("sd: " + sd.name);
	}

}
