package arraylist_problem;

import java.util.ArrayList;

public class Student {

	private static int studentID = 1000;
	String name;
	ArrayList<Student> studentList;
	
	public Student (String name) {
		this.name = name;
		studentID++;
	}
	
	public int stuID() {
		return studentID;
	}
	
	public void studentSubject(Subject sub) {
		
	}
	
	public void showStudentInfo() {
	//	System.out.println("�л� " + name + "�� " + ���� + "���� ������ " + ���� + "���Դϴ�." );
		
	}
}
