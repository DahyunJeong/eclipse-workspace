package chapter05;

public class Student {
	
	int studentID;				//��� ����(�Ӽ� ������ ��)
	String studentName;			//
	int grade;					//
	String address;				//
	
	
	//��� �����ϴ� �޼��� �κ�
	public void showStudentInfo() {		//�̸��� �ּ� ����ϴ� �޼��� //�޼���(=���)
		System.out.println(studentName + ", " + address);	
	}
	
	public String getStudentName() {	//
		return studentName;
	}
	
	public void setStudentName(String name) {	//�̸� �����ϴ� �޼���
		studentName = name;
	}

	public static void main(String[] args) {

		Student st = new Student();	//Student�� ������ st�̸��� Ŭ���� ����
		st.studentName = "�ӿ���";	//��ü ��������� �� ����
		
		System.out.println(st.studentName);			//��ü�� ��������� �� ����� ��
		System.out.println(st.getStudentName());	//�޼��� ȣ��
	}

}
