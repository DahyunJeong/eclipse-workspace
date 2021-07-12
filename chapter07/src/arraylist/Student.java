package arraylist;

import java.util.ArrayList;

public class Student {

	static int serialNum = 1000;
	String studentName;
	int studentID;
	ArrayList<Subject> subjectList;	//ArrayList 선언(해당 과목의 이름과 점수를 담은 객체형 배열 선언)
	
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
			System.out.println("학생 " + studentName + "의 " + s.getName() + " 과목 성적은 " +
			s.getScorePoint() + "점입니다.");
		}
		
		System.out.println("학번 " + studentID + " 학생 " + studentName + "의 총점은 " + total + "점입니다.");
	}
	
}
