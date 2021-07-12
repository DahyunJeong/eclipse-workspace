package arraylist;

import java.util.ArrayList;

public class Student {

	static int serialNum = 1000;
	String studentName;
	int studentID;
	ArrayList<Subject> subjectList;	//ArrayList ����(�ش� ������ �̸��� ������ ���� ��ü�� �迭 ����)
	
	public Student(String studentName) {
		serialNum++;
		studentID = serialNum;
		this.studentName = studentName;
		subjectList = new ArrayList<Subject>();
	}
	
	public void addSubject(String name, int score) {
		Subject subject = new Subject();
		subject.setName(name);
		subject.setScorePoint(score);
		subjectList.add(subject);
	}
	
	public void showStudentInfo() {
		int total = 0;
		for(Subject s : subjectList) {
			total += s.getScorePoint();
			System.out.println("�л� " + studentName + "�� " + s.getName() + " ���� ������ " +
			s.getScorePoint() + "���Դϴ�.");
		}
		
		System.out.println("�й� " + studentID + " �л� " + studentName + "�� ������ " + total + "���Դϴ�.");
	}
	
}
