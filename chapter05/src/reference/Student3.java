package reference;

public class Student3 {
	int studentID;
	String studentName;
	
	Subject korean;			//���� �ڷ��� (Subject Ŭ����) ���� ���� / ����
	Subject math;			//���� �ڷ��� (Subject Ŭ����) ���� ���� / ����

	public Student3() {
		korean = new Subject();
		math = new Subject();
	}
	
	public void setKorea (String name, int score) {
		//studentName = name;	
		korean.name = name;
		korean.scorePoint = score;
	}
	
	public void setMath (String name, int score) {
		math.name = name;
		math.scorePoint = score;
	}
}
