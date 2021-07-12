package reference;

public class Student4 {

	int studentID;			//�⺻ �ڷ���
	String studentName;		//���� �ڷ���(=��ü�ڷ���), �ڹٿ��� �⺻ �����Ǵ� ��ü�� Ÿ���� ����������
	Subject korean;			//���� �ڷ���(����� ���� ��ü �ڷ���)
	Subject math;			//���� �ڷ���(����� ���� ��ü �ڷ���)

	public Student4(int studentID, String studentName) {
		this.studentID = studentID;
		this.studentName = studentName;

		korean = new Subject();
		math = new Subject();
	}

	public void setKorean(String name, int score) {
//		korean.setName(name);
//		korean.setScorePoint(score);
		
		korean.name = name;
		korean.scorePoint = score;
	}

	public void setMath(String name, int score) {
//		math.setName(name);
//		math.setScorePoint(score);
		
		math.name = name;
		math.scorePoint = score;
	}

	public void showStudentInfo() {
		int total = korean.getScorePoint() + math.getScorePoint();
		System.out.println("�л� " + studentName + "�� " + korean.getName() +
				"�� ������ " + korean.getScorePoint() + "��, "	+ math.getName() +
				"�� ������ " + math.getScorePoint() + "��, ������ " + total + "�Դϴ�.");
		
//		total = korean.scorePoint + math.scorePoint;
//		System.out.println(total);
	}
}
