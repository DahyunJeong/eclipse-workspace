package staticex;

public class Student {
	
	public static int serialNum = 1000;	//Ŭ���� ����(��� �ν��Ͻ����� ���� ����) <== �����Ϳ��� ����
	int studentID;			//�������(=�ν��Ͻ�����) <== �������� ����
	String studentName;		//�������(=�ν��Ͻ�����)
	int grade;				//�������(=�ν��Ͻ�����)
	String address;			//�������(=�ν��Ͻ�����)
	
//	studentID = 1234;		//�� �ʱ�ȭ �� �Ǵ���? -> class ��ü�δ� ���� �ƹ��͵� ���� ����, ��ü�� �����ǰ� ����
//	serialNum = 1012;		//����������� ����� ������ class ��ü�� ������ ���� �ʱ�ȭ�ϸ� ������ ����.

	/*	
	public String getStudentName() {
		studentID = 1234;
		return studentName;
	}
	
	public void setStudentName(String name) {
		studentName = name;
	}
	*/
	
	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	
	public static int getSerialNum() {
		int i = 10;
		return serialNum;
	}
	
	
	public static void setSerialNum(int serialNum) {
		Student.serialNum = serialNum;
	}
}

